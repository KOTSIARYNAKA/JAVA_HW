package HW_18;
/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public abstract class Callable {

    Random rand = new Random();
    String str="";
    public char fileText() {
        char c = 0;
        for (int a = 0; a < 10; a++) {
            c = (char) (rand.nextInt(26) + 97);
            str += c;

        }
     //   System.out.print(c + " ");
        return c;
    }


    public void createFiles(String directoryPath, int taskId) throws IOException {



            try {
                Random random = new Random();
                long delayMillis = 1000 + random.nextInt(3000 - 1000 + 1);



                File directory = new File(directoryPath);


                if (!directory.exists()) {
                    directory.mkdirs();
               }




                for (int i = 0; i < 10; i++) {

                    long timestamp = System.currentTimeMillis(); // Текущее время в миллисекундах
                    int randomNum = random.nextInt(10000); // Случайное число от 0 до 9999

                    File file = new File(directoryPath + File.separator + "file" + timestamp + randomNum + ".txt");
                    if (file.createNewFile()) {

                        PrintWriter pw = new PrintWriter(file.toString());
                        for (int j = 1; j <= 10; j++) {
                            pw.print(fileText());
                        }
                        pw.close();

                            System.out.println("Создан файл: " + file.getName() + "от задачи " + taskId);

                    } else {

                            System.out.println("Файл уже существует: " + file.getName());

                    }
                    Thread.sleep(delayMillis);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            };

    }

    public abstract String call() throws Exception;
}

*/
