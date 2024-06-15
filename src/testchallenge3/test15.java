//다음은 2개의 정수를 입력 받아 곱을 구하는 Multiply 클래스이다......
package testchallenge3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("곱하고자 하는 두 수 입력 >> ");
            try {
                int n = input.nextInt();
                int m = input.nextInt();
                System.out.print(n + " x " + m + " = " + n * m);
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                input.nextLine();
            }
        }
        input.close();
    }
}