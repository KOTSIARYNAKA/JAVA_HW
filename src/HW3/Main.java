package HW3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a:");
        int a = sc.nextInt();

        System.out.println("Введите число b:");
        int b = sc.nextInt();

        String d = (a % b) == 0 ? "1.1 Число а делится без остатка на число b. Результат " + a / b:
                "1.1 Число а не делится на число b без остатка. Отстаток равен " + a % b;
        System.out.println(d);

    }
}
