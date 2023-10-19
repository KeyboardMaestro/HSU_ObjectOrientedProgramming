package week2;

import java.util.Scanner;
import java.util.TreeMap;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오 >> ");
        int won = scanner.nextInt();
        scanner.close();

        TreeMap<Integer, String> moneys = new TreeMap<>(java.util.Collections.reverseOrder());
        moneys.put(50000, "오만원권매");
        moneys.put(10000, "만원권매");
        moneys.put(5000, "오천원권매");
        moneys.put(1000, "천원권매");
        moneys.put(500, "오백원개");
        moneys.put(100, "백원개");
        moneys.put(50, "오십원개");
        moneys.put(10, "십원개");
        moneys.put(1, "일원개");

        for (int money : moneys.keySet()) {
            int number = won / money;
            won %= money;
            String moneyString = moneys.get(money);
            String denomination = moneyString.substring(0, moneyString.length() - 2);
            String unit = moneyString.substring(moneyString.length() - 2);
            System.out.println(denomination + " " + number + " " + unit);
        }
    }
}



