package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int minMasive = 1000;
        int maxMasive = 0;
        int n = 100;
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);

        }
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if (i > maxMasive) {
                maxMasive = i;
            }
        }
            System.out.println("Наибольший элемент массива " + maxMasive);

        for (int i : arr) {
            if (i < minMasive) {
                minMasive = i;
            }

        }
        System.out.println("Наиеньший элемент массива " + minMasive);

        int counter = 0;
        for (int i : arr) {
            if (i % 10 == 0){
                counter++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0- "+counter);
        int sum = 0;
        for (int i : arr) {
            if (i % 10 == 0){
                sum += i;
            }

        }
        System.out.println("сумму элементов массива, оканчивающихся на 0- "+sum);
    }
}