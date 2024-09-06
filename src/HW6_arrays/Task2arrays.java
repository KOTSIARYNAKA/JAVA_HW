package HW6_arrays;
import java.util.Arrays;
public class Task2arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);}

        //Вариант 1 через метод max() из класса Arrays и stream() из класса Arrays

            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println("Максимальное значение: " + max);

             int min = Arrays.stream(arr).min().getAsInt();
             System.out.println("Минимальное значение: " + min);
        System.out.println();

        //Вариант 2 Использование цикла for для поиска максимального значения

           int max2 = arr[0];
           for (int i=1; i<arr.length; i++){
               if (arr[i]>max2) {
                   max2 = arr[i];
               }
           }
        System.out.println("Максимальное значение: " + max2);

           int min2 = arr[0];
           for (int i=1; i<arr.length; i++) {
               if (arr[i]<min2) {
                   min2=arr[i];
               }

           }
        System.out.println("Минимальное значение: " + min2);
    }
}