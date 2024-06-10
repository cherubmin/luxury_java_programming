//원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
//두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
package testchallenge2;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 원의 중심과 빈지름 입력>>");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double r1 = sc.nextInt();
        System.out.println("두번째 원의 중심과 반지름 입력>>");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double r2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));


        if (distance <= r1 + r2) {
            System.out.println("두 원은 서로 겹친다.");
        } else System.out.println("두 원은 서로 안겹친다.");

        sc.close();
    }
}
