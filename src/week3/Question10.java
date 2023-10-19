package week3;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int centreX1 = scanner.nextInt(); // 원1 중심 X 좌표
        int centreY1 = scanner.nextInt(); // 원1 중심 Y 좌표
        int radius1 = scanner.nextInt(); // 원1의 반지름
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int centreX2 = scanner.nextInt(); // 원2 중심 X 좌표
        int centreY2 = scanner.nextInt(); // 원2 중심 Y 좌표
        int radius2 = scanner.nextInt(); // 원2의 반지름

        double distance = Math.sqrt(Math.pow(centreX1-centreX2, 2) + Math.pow(centreY1-centreY2, 2));
        System.out.println((distance > radius1 + radius2)? "두 원은 서로 겹치지 않는다.":"두 원은 서로 겹친다.");
    }
}
