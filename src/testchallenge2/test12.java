//사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +, = , *, /의 네 가지로 하고 피연산자는 모두 실수로 한다.
//피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
//0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
package testchallenge2;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산(빈칸으로 분리하여 입력하시오)>>");
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();

        if(s.equals("+")) {
            System.out.println(a + b);
        }
        if(s.equals("=")) {
            System.out.println(a = b);
        }
        if(s.equals("*")) {
            System.out.println(a * b);
        }
        if(s.equals("/")) {
            System.out.println(a / b);
        }
        sc.close();
    }
}
