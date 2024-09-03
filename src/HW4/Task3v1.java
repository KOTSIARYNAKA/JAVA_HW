package HW4;

import java.util.Scanner;

public class Task3v1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x:");
        int x = sc.nextInt();
        int result = 15 / x;

        if (15 % x ==0) {
            switch (result) {
                case 1:
                    System.out.println("Результат деления равен 1");
                    break;
                case 3:
                    System.out.println("Результат деления равен 3");
                    break;
                case 5:
                    System.out.println("Результат деления равен 5");
                    break;
                case 15:
                    System.out.println("Результат деления равен 15");
                    break;
            }
        }
        else {
            float x1 = x;
            float NEWresult = 15 / x1;

            System.out.println("Результат деления равен дробному числу " + NEWresult);
        }

        }
        }






