package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
while (true) {
    System.out.println("Введите первое число");
    int x = in.nextInt();
    System.out.println("Введите второе число");
    int y = in.nextInt();
    if (y == 0) {
        break;
    }
      int z = x / y;
        System.out.println(z);

}
    }
}
