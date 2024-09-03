package HW4;

import java.util.Scanner;

public class Task3v2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x:");
        int x = sc.nextInt();
        int result = 15 / x;
        int i = 15 % x;

        switch (i) {
            case 0:
                System.out.println("Результат деления равен " + result); // 1, 3, 5, 15
            default:
                float x1 = x;
                float NEWresult = 15 / x1;
                System.out.println("Результат деления равен дробному числу " + NEWresult);
        }

    }
}
