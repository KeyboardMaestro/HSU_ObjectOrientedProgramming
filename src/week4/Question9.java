package week4;

public class Question9 {
    public static void main(String[] args) {
        int[][] square = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                square[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(square[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
