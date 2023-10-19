package week7;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] circles = new Circle[3];
        for(int i = 0; i < circles.length; i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            circles[i] = new Circle(x,y,radius);
        }

        for (Circle circle : circles){ // for(int i = 0; i < circles.length; i++)
            circle.show();
        }

        showLargest(circles);
        scanner.close();
    }

    public static void showLargest(Circle[] circles){
        System.out.print("가장 면적이 큰 원은 ");
        for (Circle circle : circles)
            if (circle.getRadius() == Circle.getLargestRadius()){
                circle.show();
                break;
            }
    }
}