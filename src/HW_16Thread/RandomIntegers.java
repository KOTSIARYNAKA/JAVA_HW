package HW_16Thread;

import java.util.Random;

public class RandomIntegers extends Thread{
    private int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public void run() {
        Random random = new Random();
        int[] array = random.ints(10, 0, 100).toArray(); // Генерация массива из 10 элементов
        int max = findMax(array);

        System.out.println(" Максимальный элемент = " + max + " поток: " + getName());
    }

}
