package HW_18;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CallableDemo {
    public static void main(String[] args) throws IOException {

        ExecutorService executor = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Запуск задачи " + taskId + " в потоке " + Thread.currentThread().getName());
                   try {
                    Callable callable = new Callable();
                    callable.createFiles("C:\\Users\\ekaterina.ezepchik\\IdeaProjects\\untitled\\src\\HW_18", taskId);
                } catch (IOException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Задача " + taskId + " завершена в потоке " + Thread.currentThread().getName() );
            });
        }
        executor.shutdown();
    }
}