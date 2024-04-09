package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boing = new Airplane("Boing", 1980, 9.84, 2000,0);
        boing.setYear(1994);
        boing.setLength(10.25);
        boing.fullUp(20);
        boing.fullUp(15);
        boing.info();




    }
}
