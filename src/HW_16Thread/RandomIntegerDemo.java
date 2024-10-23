package HW_16Thread;

public class RandomIntegerDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            RandomIntegers a = new RandomIntegers();
            a.start();
        }


    }
}
