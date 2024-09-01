package HW3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();

        System.out.println("Введите число b:");
        int b = sc.nextInt();

        int c = a != 0 && a > 1 ? b / a : a *b;
        System.out.println("Результат: " + c);

    }
}
