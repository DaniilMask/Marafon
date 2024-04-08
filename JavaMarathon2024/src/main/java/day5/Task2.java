package day5;


public class Task2 {
    public static void main(String[] args) {
        MotorBike bike = new MotorBike("Suzuki", "Green", "2015");
        System.out.println(bike.getColor());
        System.out.println(bike.getModel());
        System.out.println(bike.getYear());


    }
}
class MotorBike{
    String model;
    String color;
    String year;
    public MotorBike (String model, String color, String year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getYear() {
        return year;
    }


}
