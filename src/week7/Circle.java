package week7;

public class Circle {
    private double x, y;
    private int radius;
    private static int largest;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        if (radius > largest)
            largest = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void show() {
        System.out.println("("+x+","+y+")"+radius);
    }

    public static int getLargestRadius() {
        return largest;
    }
}