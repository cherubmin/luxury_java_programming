//Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//십의 자리와 일의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
package testchallenge2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2자리수 정수 입력(10~99)>>");
        int n = sc.nextInt();

        int a = n/10; //십의 자리
        int b = n%10; //일의 자리

        if (a == b) {
            System.out.println("십의 자리와 일의 자리가 같음");
        } else
            System.out.println("십의 자리와 일의 자리가 다름");

        sc.close();

    }
}
