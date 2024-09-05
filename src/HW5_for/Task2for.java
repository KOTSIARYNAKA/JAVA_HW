package HW5_for;

public class Task2for {
    public static void main(String[] args) {
        for (int x = 1; x <=100 ; x++) {
            if (x % 3 == 0 || x % 7 == 0)
                System.out.println(x + " ");
        }
    }
}