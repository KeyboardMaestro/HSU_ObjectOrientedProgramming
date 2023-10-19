package week3;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (inRect(x1, y1) || inRect(x1, y2) || inRect(x2, y1) || inRect(x2, y2)) // 네 점중 하나가
            System.out.println("충돌합니다");
        else
            System.out.println("충돌하지 않습니다.");
    }

    public static boolean inRect(int x, int y) {
        return (x>= 100 && x <= 200) && (y >= 100 && y <= 200);
    }
}
