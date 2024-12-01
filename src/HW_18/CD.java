package HW_18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CD implements Callable {

    private static final Random RANDOM = new Random();
    StringBuilder str = new StringBuilder();

    public char fileText() {
        char c = (char) (RANDOM.nextInt(26) + 97); // Генерируем один случайный символ
        str.append(c); // Добавляем символ в StringBuilder
        return c;
    }

    private static final String FILE_PREFIX = "file_";
    private static final String FILE_EXTENSION = ".txt";


    @Override
    public String call() throws Exception {
        String filename = FILE_PREFIX + System.currentTimeMillis() + "_" + RANDOM.nextInt(1000) + FILE_EXTENSION;


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < 10; i++) {
                writer.write(fileText()); // Записываем каждый сгенерированный символ
                writer.newLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(RANDOM.nextInt(3000) + 1000);


        System.out.println(Thread.currentThread().getName() + " created: " + filename);
        return filename;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> future = executor.submit(new CD());
            futures.add(future);
        }
        executor.shutdown();

    }
}

