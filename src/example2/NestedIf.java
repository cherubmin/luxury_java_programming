//점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격하는 프로그램을 코딩하여라.
package example2;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수와 학년을 공백으로 구분하여 입력하시오");
        int score = sc.nextInt();
        int grade = sc.nextInt();

        if (grade == 4) {
            if (score >= 70) {
                System.out.println("합격");
            } else
                System.out.println("불합격");
        } else {
            if (score >= 60) {
                System.out.println("합격");
            } else
                System.out.println("불합격");
        }
        sc.close();
    }
}
