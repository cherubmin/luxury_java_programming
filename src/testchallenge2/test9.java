//원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x, y)를
//입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
package testchallenge2;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 중심 x, y좌표와 반지름 입력:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = sc.nextDouble();

        System.out.println("다른 점 입력:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((x - x2)*(x - x2) + (y - y2)*(y - y2));
        if(distance < r)
            System.out.print("점 (" + x2 + ", " + y2 + ")는 원 안에 있다.");
        else
            System.out.print("점 (" + x2 + "," + y2 + ")는 원 밖에 있다.");

        sc.close();
    }
}
