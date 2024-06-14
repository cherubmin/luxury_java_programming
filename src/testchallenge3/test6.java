/*
배열과 반복문을 이용하여 프로그램을 작성하라.
키보드에서 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전,
10원짜리 동전, 1원짜리 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라.
이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
 */

package testchallenge3;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하시오>>");
        int money = sc.nextInt();

        for (int i = 0; i < unit.length; i++) {
            if (money >= unit[i]) {
                int money1 = money / unit[i];
                money = money - unit[i]*money1;
                System.out.println(unit[i] + "원 짜리 : " + money1 + "개");
            }
        }
    }
}
