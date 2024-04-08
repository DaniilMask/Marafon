package day4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int more8 = 0;
        int equally1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            int d = random.nextInt(diff + 1) + min;
            arr[arr_i] = d;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина масива: "+n);
        for (int i:arr) {
            if (arr[i] > 8 ) {
                more8++;
            }
        }
        System.out.println("Количество чисел больше 8: "+more8);
        for (int i:arr) {
            if (arr[i] == 1 ) {
                equally1++;
            }
        }
        System.out.println("Количество чисел равно 1: "+equally1);
        for (int i:arr) {
            if (arr[i] % 2 == 0 ) {
                evenNumbers++;
            }
        }
        System.out.println("Количество четных чисел: "+evenNumbers);
        for (int i:arr) {
            if (arr[i] % 2 == 1 ) {
                oddNumbers++;
            }
        }
        System.out.println("Количество нечетных чисел: "+oddNumbers);

        for(int i:arr){
            sum += arr[i];
        }
        System.out.println("Сумма всех элементов массива: "+sum);
    }
}
