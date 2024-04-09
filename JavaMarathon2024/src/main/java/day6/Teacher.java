package day6;

import java.util.Random;

public class Teacher {
    final int min = 2; // Минимальное число для диапазона
    final int max = 5; // Максимальное число для диапазона
    final int rnd = rnd(min, max);
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private String name;
    private String subject;
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    public void evaluate(@org.jetbrains.annotations.NotNull Student student){

        System.out.println("Преподаватель "+name+" оценил студента с именем "+student.getName()+" по предмету "+subject+" на оценку "+rnd(min,max));

    }

}
