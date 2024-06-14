//Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
//다음은 5를 입력했을 때의 예다.
package testchallenge3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {//i < n = 0 1 2 3 4
            for (int j = 0; j < n - i; j++) {// n - i = 5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
