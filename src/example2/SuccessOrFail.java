//시험점수가 80점 이상이라면 합격 판별을 하는 프로그램을 작성하라.
package example2;
import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험 점수를 입력하시오: ");

        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        sc.close();//꼭 해줘야함(메모리 용량이나 이것저것 문제 땜에
    }
}
