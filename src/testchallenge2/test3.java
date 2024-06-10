//Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전,
//50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력하라.
package testchallenge2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하시오>>");
        int amount = sc.nextInt();

        int 오만원 = 0;
        int 만원 = 0;
        int 천원 = 0;
        int 오백원 = 0;
        int 백원 = 0;
        int 오십원 = 0;
        int 십원 = 0;
        int 일원 = 0;

        if (amount >= 50000) {
            오만원 = amount/50000;
            amount %= 50000;
        }

        if (amount >= 10000) {
            만원 = amount / 10000;
            amount %= 10000;
        }

        if (amount >= 1000) {
            천원 = amount / 1000;
            amount %= 1000;
        }

        if (amount >= 500) {
            오백원 = amount / 500;
            amount %= 500;
        }

        if (amount >= 100) {
            백원 = amount / 100;
            amount %= 100;
        }

        if (amount >= 50) {
            오십원 = amount / 50;
            amount %= 50;
        }

        if (amount >= 10) {
            십원 = amount / 10;
            amount %= 10;
        }

        if (amount >= 1) {
            일원 = amount / 1;
            amount %= 1;
        }

        System.out.println("오만원권:" + 오만원);
        System.out.println("만원권:" + 만원);
        System.out.println("천원권:" + 천원);
        System.out.println("오백원:" + 오백원);
        System.out.println("백원:" + 백원);
        System.out.println("오십원:" + 오십원);
        System.out.println("십원:" + 십원);
        System.out.println("일원:" + 일원);

        sc.close();
    }
}
