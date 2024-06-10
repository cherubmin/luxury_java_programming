// Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
//평균값을 구하는 것이 아님에 주의하라.
package testchallenge2;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개 입력>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (((a < b) && (b < c)) || ((c < b) && (b < a))){
            System.out.println("중간 값은 " + b);
        }

        if (((a < c) && (c < b)) || ((b < c) && (c < a))){
            System.out.println("중간 값은 " + c);
        }

        if (((b < a) && (a < c)) || ((c < a) && (a < b))){
            System.out.println("중간 값은 " + a);
        }

    }
}
