package week7;

public class Circle2 {
    public double radius;

    public static double PI = 3.141592;

    public Circle2(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * PI;
    }

    public double getCircumference() {
        return 2 * radius * PI;
    }

    public void print() {
        System.out.printf("반지름이 %.2f인 원의 면적은 %.2f이고, ", radius, getArea());
        System.out.printf(" 둘레 길이는 %.2f이다. \n", radius, getCircumference());
    }

    public static void main(String[] args) {
        Circle2 c1 =new Circle2(2.78);
        c1.print();

        Circle2 c2 = new Circle2(5.25);
        c2.print();

        Circle2.PI = 3.14;
        c1.PI = 3.14;

        System.out.println(c2.PI);
    }
}
