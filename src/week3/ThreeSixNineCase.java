package week3;

public class ThreeSixNineCase {
    public static void main(String[] args) {
        for (int i = 100; i <= 199 ; i++){
            int digit1 = i / 10;
            int digit2 = i % 10;
            if (digit1 != 0 && digit1 % 3 ==0)
                System.out.println(i + " 박수 짝");
            if (digit2 != 0 && digit2 % 3 == 0)
                System.out.println(i + " 박수 짝");
        }
    }
}
