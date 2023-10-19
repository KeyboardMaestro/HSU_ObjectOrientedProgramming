package week3;

import java.util.Scanner;

public class CalculationIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation = scanner.nextLine();

        String[] tokens = calculation.split(" ");

        double result = 0;

        String operator = tokens[1];
        if (tokens[1].equals("/") && tokens[2].equals("0"))
            System.out.println("0으로 나눌 수 없습니다.");
        else{
            if (operator.equals("+")){
                result = Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]);
                System.out.printf("결과는 %f 입니다. \n", result);
            } else if (operator.equals("-")) {
                result = Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]);
                System.out.printf("결과는 %f 입니다. \n", result);
            } else if (operator.equals("/")) {
                result = Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]);
                System.out.printf("결과는 %f 입니다. \n", result);
            } else if (operator.equals("*")) {
                result = Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]);
                System.out.printf("결과는 %f 입니다. \n", result);
            }
            else
                System.out.println("잘못된 연산 기호 입니다.");
        }

    }
}
