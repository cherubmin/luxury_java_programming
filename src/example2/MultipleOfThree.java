//입력된 수가 3의 배수인지 판별하는 프로그램을 작성하라.
package example2;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하시오: ");

        int number = sc.nextInt();

        if (number % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
        sc.close();
    }
}
