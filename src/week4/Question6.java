package week4;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int[] units = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오");
        int won = scanner.nextInt();

        for (int unit : units){
            if (won/unit == 0)
                continue;
            System.out.println(unit+"원 짜리 : " + won/unit + "개");
            won %= unit;
        }

        scanner.close();
    }
}
