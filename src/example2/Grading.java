//다중 if-else 문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성하라.
package example2;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하시오");
        int score = sc.nextInt();
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else
            grade = 'F';

        System.out.println("학점은: " + grade + "입니다.");
        sc.close();
    }

}
