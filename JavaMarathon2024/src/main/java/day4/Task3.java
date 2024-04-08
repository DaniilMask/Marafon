package day4;

import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int lineMax = 0;
        int [][] masive = new int [12][8];
        Random rand = new Random();
        for (int i = 0; i < masive.length; i++){
            for (int j = 0; j < masive[i].length; j++) {
                masive[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < masive.length; i++){
            for (int j = 0; j < masive[i].length; j++){
                sum = 0;
                sum += masive[i][j];
            }
            if (sum >= sum1){
                lineMax = i;
                sum1 = sum;

            }
        }
        System.out.println("Ответ: "+lineMax);
    }
}
