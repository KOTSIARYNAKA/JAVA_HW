package HW4;

import java.util.Scanner;

public class Task3v2switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x:");
        int x = sc.nextInt();
        while (x==0){
            System.out.println("На ноль делить нельзя, введите другое число: ");
            x = sc.nextInt();}

        double result = (double) 15 / x;
        int i = 15 % x;

        switch (i) {
            case 0:
                System.out.println("Результат деления равен " + (int) result); // 1, 3, 5, 15
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + result);
        }

    }
}
