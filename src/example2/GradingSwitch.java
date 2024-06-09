//학점 매기는 코드를 switch 문으로 다시 작성하라.
package example2;

import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 : ");
        int score = sc.nextInt();
        char grade;

        switch (score/10) {
            case 10, 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은 " + grade);
        sc.close();
    }
}
