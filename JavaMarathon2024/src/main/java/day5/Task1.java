package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        System.out.println(car.getColor());
        car.setModel("Ford Kuga");
        System.out.println(car.getModel());
        car.setYear("2016");
        System.out.println(car.getYear());

    }
}
class Car {
    private String model;
    private String color;
    private String year;

    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public String getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
}
