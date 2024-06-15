//너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램을 작성하라.
//너비와 높이 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용하라.
package example4;

import java.util.Scanner;

class Rectangle {
    int width, height;
    public int getArea() {
        return width * height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println(">> ");
        rect.width = sc.nextInt();
        rect.height = sc.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        sc.close();
    }
}
