package HW6_arrays;

public class Task1arrays {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }

    }

}
