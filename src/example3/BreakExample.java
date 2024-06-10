//"exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.
package example3;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("exit를 입력하면 종료됩니다.");

        while (true) {
            System.out.print(">>");
            String text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        }
        sc.close();
    }
}
