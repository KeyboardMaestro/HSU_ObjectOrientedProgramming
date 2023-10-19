package week4;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i ++){
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("평균은 " + Arrays.stream(array).average().getAsDouble());
    }
}
