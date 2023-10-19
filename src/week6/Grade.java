package week6;

public class Grade {
    private int math;
    private int science;
    private int english;

    Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public double average(){
        return (math + science + english) / 3.0;
    }
}
