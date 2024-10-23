package HW_16Thread;

public class Car implements Runnable {
    private String name;
    private int stopTime;

    public Car(String name, int stopTime) {
        this.name = name;
        this.stopTime = stopTime;

    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Едет " + name);
            try {
                Thread.sleep(200l);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (stopTime > 0) {
                System.out.println(name + " останавливается на " + stopTime + " мс.");
                try {
                    Thread.sleep(stopTime); // Остановка
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
