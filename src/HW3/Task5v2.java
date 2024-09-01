package HW3;

public class Task5v2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = 6;
        int c = --x + ++y * z--;

        System.out.println("Результат: x = " + x + ", у = " + y + ", z = " + z + ", c = " + c);

    }
}