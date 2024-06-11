//두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램 코드이다.
//사용자가 나누는 수에 0을 입력하면 ArithmeticException 예외가 발생하여 프로그램이 강제 종료된다.
package example3;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt(); //나뉨수
        int divisor = sc.nextInt(); //나눗수

        System.out.println("나뉨수를 입력하시오:");
        dividend = sc.nextInt();

    }
}
