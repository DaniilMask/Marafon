package day6;


class MotorBike {
    private String model;
    private String color;
    private int year;
    public MotorBike(String model, String color,int year){
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
    public int getYear() {
        return year;
    }
    public void info() {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        if (year > inputYear){
            return year - inputYear;
        }else
            return inputYear - year;
    }


}
