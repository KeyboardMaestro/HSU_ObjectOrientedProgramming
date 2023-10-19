package week4;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        boolean isCourse;
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("과목 이름>>");
            String input = scanner.next();
            isCourse = true;
            for (int i = 0; i < course.length; i++){
                if (course[i].equals(input)){
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    isCourse = false;
                    break;
                }
                else
                    isCourse = true;
            }
            if (isCourse)
                System.out.println("없는 과목 입니다.");
        }while (!scanner.nextLine().equals("그만"));
    }
}
