//다음 설명대로 Circle 클래스와 CircleManager 클래스를 완성하라.
package testchallenge4;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; //초기화
        this.y = y; //초기화
        this.radius = radius; //초기화
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
}

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for(int i = 0; i < c.length; i++) {
            System.out.print("x, y , radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        for(int i = 0; i < c.length; i++) {
            c[i].show();
        }
        sc.close();
    }
}
