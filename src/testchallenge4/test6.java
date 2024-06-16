//test5번을 참고하여 아래와 같이 실행되게 수정하라.
package testchallenge4;

import java.util.Scanner;

class Circle1 {
    private double x, y;
    private int radius;
    public Circle1(double x, double y, int radius) {
        this.x = x; //초기화
        this.y = y; //초기화
        this.radius = radius; //초기화
    }
    public int getRadius() {
        return radius;
    }
    public void show() {
        System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")" + radius);
    }
}

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle1 c[] = new Circle1[3];
        for(int i = 0; i < c.length; i++) {
            System.out.print("x, y , radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle1(x, y, radius);
        }
        int max = 0, maxRadius = 0;
        for(int i = 0; i < c.length; i++) {
            if(maxRadius < c[i].getRadius()) {
                maxRadius = c[i].getRadius();
                max = i;
            }
        }
        c[max].show();
        sc.close();
    }
}
