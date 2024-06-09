//상수 PI를 선언하고 원의 면적을 구하는 프로그램을 작성하라.
package example2;

public class CircleArea {

    public static void main(String[] args) {
       final double PI = 3.14;

       double radius = 10.0;
       double circleArea = radius * radius * PI;

       System.out.println("Circle Area = " + circleArea);
    }
}
