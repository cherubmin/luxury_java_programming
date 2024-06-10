/*
2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다.
키보드로부터 직사각형을 구성하는 두 점 (x1, x2), (x2, y2)를 입력받아 (100, 100), (200, 200)의
두점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
 */
package testchallenge2;

import java.util.Scanner;

public class test8 {

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 점(x1, y1), (x2, y2)를 입력하시오>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (inRect(x1, y1, 100, 100, 200, 200) ||
                inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("충돌합니다.");
        else System.out.println("충돌 안합니다.");

    }
}
