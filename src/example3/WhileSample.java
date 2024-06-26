//while 문은 반복 횟수를 알지 못하는 경우에 이용된다고 했다.
//while 문을 이용하여 -1이 입력될 때까지 정수를 계속 입력받아 합응ㄹ 구하고 평균을 출력하는 프로그램을 작성하라.
package example3;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        int n = sc.nextInt();
        while (n != -1) {
            sum += n;
            count++;
            n = sc.nextInt();
        }
        if(count == 0)
            System.out.println("입력된 수가 없습니다.");
        else {
            System.out.println("정수의 개수는 " + count + "개이며 ");
            System.out.println("평균은 " + (double) sum / count + "입니다.");
        }
        sc.close();
    }
}
