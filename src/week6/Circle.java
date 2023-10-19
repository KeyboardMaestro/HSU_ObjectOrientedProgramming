package week6;

public class Circle {
    int radius;
    String name;

    public double getArea() {
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바 피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바 도넛";
        area = donut.getArea();
        System.out.println(donut.name + " 의 면적은 "+ area);
    }
}
