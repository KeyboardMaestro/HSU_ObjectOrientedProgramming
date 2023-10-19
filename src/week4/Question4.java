package week4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        char character = scanner.nextLine().charAt(0);
        for (int i = 97; i <= character; i++){
            for (int j = 0; j <= (character - i); j++)
                System.out.print((char) (97 + j));
            System.out.println();
        }
    }
}
