package f;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileGenerator implements Callable<String> {
    private static final Random RANDOM = new Random();
    private static final String FILE_PREFIX = "file_";
    private static final String FILE_EXTENSION = ".txt";

    @Override
    public String call() throws Exception {
        // Генерация имени файла
        String fileName = FILE_PREFIX + System.currentTimeMillis() + FILE_EXTENSION;

        // Запись 10 случайных строк в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.write(generateRandomString());
                writer.newLine();
            }
        }

        // Случайная пауза от 1 до 3 секунд
        Thread.sleep(RANDOM.nextInt(3000) + 1000);

        // Вывод имени потока и имени файла
        System.out.println(Thread.currentThread().getName() + " created " + fileName);

        return fileName;
    }

    private String generateRandomString() {
        int length = RANDOM.nextInt(10) + 5; // длина строки от 5 до 15 символов
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = (char) (RANDOM.nextInt(26) + 'a'); // случайный символ от 'a' до 'z'
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();

        // Создание 10 задач
        for (int i = 0; i < 10; i++) {
            tasks.add(new FileGenerator());
        }

        try {
            // Запуск задач и получение результатов
            executor.invokeAll(tasks);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}