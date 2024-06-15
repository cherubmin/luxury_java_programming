//반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력하라.
package example4;

class Circle1 {
    int radius;
    public Circle1(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius * radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circle1 [] c; //Circle 배열에 대한 레퍼런스 c 선언
        c = new Circle1[5]; //5개의 레퍼런스 배열 생성

        for(int i = 0; i < c.length; i++)
            c[i] = new Circle1(i);

        for(int i = 0; i < c.length; i++)
            System.out.println((int)(c[i].getArea()) + " ");
    }
}
