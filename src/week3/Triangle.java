package week3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 3개를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int longest = (Math.max(a,b) == a)? Math.max(a,c): Math.max(b,c);

        int sum = a + b + c - longest;

        if (sum > longest)
            System.out.println("삼각형이 됩니다.");
        else
            System.out.println("삼각형이 안됩니다.");
    }
}
