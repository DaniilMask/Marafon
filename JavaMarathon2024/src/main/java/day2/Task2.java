package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = in.nextInt();
        System.out.println("Введите 2 число");
        int b = in.nextInt();
        for(int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i+ " ");
            }
        }

    }
}
