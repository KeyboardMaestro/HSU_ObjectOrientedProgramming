package week2;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 10.2;
        double circleArea = Math.pow(radius, 2) * PI;

        System.out.print("반지름 " + radius + ", ");
        System.out.println("원의 면적 = " +circleArea);


    }
}
