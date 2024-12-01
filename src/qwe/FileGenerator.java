/*package HW_18;
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

public class FileGenerator implements Callable<String> {

    private static final Random RANDOM = new Random();
    private static final String FILE_PREFIX = "file_";
    private static final String FILE_EXTENSION = ".txt";

 //   @Override
    public String call() throws Exception {

        String filename = FILE_PREFIX + System.currentTimeMillis() + FILE_EXTENSION;


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < 10; i++) {
                writer.write(generateRandomString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Thread.sleep(RANDOM.nextInt(3000) + 1000);


        System.out.println(Thread.currentThread().getName() + " created: " + filename);

        return filename;
    }

    private String generateRandomString() {
        int length = RANDOM.nextInt(10) + 1;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = (char) (RANDOM.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            futures.add(executor.submit(new FileGenerator()));
        }


        executor.shutdown();


        for (Future<String> future : futures) {
            try {
                System.out.println("File created: " + future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
*/