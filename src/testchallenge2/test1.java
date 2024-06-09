//Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라. $1=1100원으로 가정하고 계산하라.
package testchallenge2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력하세요(단위 원)>>");
        int won = sc.nextInt();
        float dollar = (float) won /1100;

        System.out.printf("%d원은 $%.1f입니다.%n", won, dollar);
        sc.close();
    }
}
