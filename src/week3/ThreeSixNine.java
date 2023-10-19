package week3;

import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder("박수");
        int number = scanner.nextInt();
        int digit1 = number/10;
        int digit2 = number%10;
        if (digit1 != 0 && digit1%3 == 0)
            string.append("짝");
        if (digit2 != 0 && digit2%3 == 0)
            string.append("짝");

        System.out.println(string);
    }
}
