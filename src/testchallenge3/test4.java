//Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라.
//다음은 e를 입력받았을 경우이다.
package testchallenge3;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("소문자 알파벳 하나를 입력하시오>>");
        char ch = sc.next().charAt(0); //사용자가 입력한 첫 번째 문자를 받는다.

        //문자를 정수로 변환
        int asciValue = (int)ch;

        for (int i = 0; i <= (ch - 'a'); i++) {//예를 들어, 사용자가 'e'를 입력하면, ch는 'e'이고, 'e' - 'a'는 4가 된다.
            // 따라서 i는 0부터 4까지 증가한다.
            for (int j = 'a'; j <= asciValue - i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
        sc.close();
    }
}
