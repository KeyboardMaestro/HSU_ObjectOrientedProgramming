package week6;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book2[] book = new Book2[2];

        for (int i = 0; i < book.length; i++){
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book2(title, author);
        }

        for (Book2 book2 : book) {
            System.out.println("(" + book2.title + ", " + book2.author + ")");
        }
    }
}
