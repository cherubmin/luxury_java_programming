//5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라.
package example3;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세오");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if(n <= 0)
                continue;
            else
                sum += n;
        }
        System.out.println("양수의 합은 " + sum);

        sc.close();
    }
}
