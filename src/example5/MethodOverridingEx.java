//Shape의 drow() 메소드를 Line, Circle, Rect 클래스에서 목적에 맞게 오버라이딩하는 다형성의 사례를 보여준다.
package example5;

import java.awt.*;

class Shape {// 슈퍼 클래스
    public Shape next; //
    public Shape() { next = null; }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { //메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { //메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {//메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw(); //p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
    }
    public static void main(String[] args) {
        Line line = new Line();

        //다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
        paint(line);//Line에 오버라이딩한 draw() 실행, "Line" 출력
        paint(new Shape());//Shape의 draw() 실행. "Shape" 출력
        paint(new Line()); //Line에 오버라이딩한 draw() 실행, "Line" 출력
        paint(new Rect()); //Rect에 오버라이딩한 draw() 실행, "Rect" 출력
        paint(new Circle()); //Circle에 오버라이딩한 draw() 실행, "Circle" 출력
    }
}
