package week2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int input = scanner.nextInt();
        int two = input%10;
        int one = input/10;
        //(one == two) ? System.out.println("Yes! 10의 자리와 1의 자리가 같습니다."); System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
    }
}
