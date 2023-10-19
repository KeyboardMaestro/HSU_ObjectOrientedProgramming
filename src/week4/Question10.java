package week4;

public class Question10 {
    public static void main(String[] args) {
        int[][] square = new int[4][4];
        int count = 0;

        while (count < 10){
            int row = (int) (Math.random() * 4);
            int col = (int) (Math.random() * 4);
            if (square[row][col] == 0){
                square[row][col] = (int) (Math.random() * 10 + 1);
                count++;
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(square[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
