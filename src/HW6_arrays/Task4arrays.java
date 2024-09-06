package HW6_arrays;

public class Task4arrays {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i< arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);

        }

        System.out.println();
        for (int i = 0;i< arr.length;i++){
            if (i%2 !=0) {
                arr[i] = 0;
            }

         }
        for (int i = 0; i< arr.length;i++) {
            System.out.println(arr[i]);
        }
        }
    }

