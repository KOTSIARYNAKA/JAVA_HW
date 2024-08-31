package HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Введите число a:");
         int a = sc.nextInt();

         System.out.println("Введите число b:");
         int b = sc.nextInt();

         String c = a == 0 ? "Результат " + b: "Результат " + a / b;
        System.out.println(c);
    }
}
