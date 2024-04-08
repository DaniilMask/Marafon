package day4;


import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        int x = 0;
        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(1000);

        }
        for (int i = 0; i < arr.length - 2; i++){
            x = arr[i] + arr[i + 1] + arr[i + 2];
            if (x > sum ) {
                sum = x;
                number = i;
            }
        }
        System.out.println(sum);
        System.out.println(number);



    }
}
