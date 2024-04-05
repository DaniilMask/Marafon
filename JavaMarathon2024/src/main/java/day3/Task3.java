package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Введите первое число: ");
            int x = in.nextInt();
            System.out.println("Введите второе число: ");
            int y = in.nextInt();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            int z = x / y;
            System.out.println("Ответ "+z);

        }

    }
}
