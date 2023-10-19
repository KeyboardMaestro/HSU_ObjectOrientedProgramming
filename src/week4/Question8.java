package week4;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        int count = 0;
        boolean isDuplicated = false;
        while (count < number){
            int temp = (int) (Math.random()*100 + 1);
            for (int j = 0; j <= count; j++)
                if (arr[j] == temp) {
                    isDuplicated = true;
                    break;
                }
            if (isDuplicated){
                isDuplicated = false;
                continue;
            }
            else {
                arr[count] = temp;
                System.out.print(arr[count] + " ");
                count++;
            }
        }
    }
}
