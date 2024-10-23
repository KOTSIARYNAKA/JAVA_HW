package HW_16Thread;

public class CarDemo {
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car("Машина 1", 2000);
        Car car2 = new Car("Машина 2", 1000);
        Car car3 = new Car("Машина 3", 1500);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        thread1.start();
        thread1.join();
        thread2.start();
        thread3.start();


    }
}
