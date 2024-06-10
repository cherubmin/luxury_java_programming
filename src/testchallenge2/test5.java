//Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고
//이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
//삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
package testchallenge2;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
            System.out.println("삼각형이 안된다.");
        } else
            System.out.println("삼각형이 된다.");

        sc.close();
    }
}
