package HW6_arrays;
import java.util.Arrays;
public class Task5arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        //Сортировка по возрастанию
        boolean sorted = false;
         while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                     int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
         }
        System.out.println(Arrays.toString(arr));

         //Сортировка по убыванию
        sorted = false;
        while (!sorted) {
            sorted = true;
            for (int b = 0; b < arr.length-1; b++) {
                if (arr[b] < arr[b + 1]) {
                    sorted = false;
                    int a = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}