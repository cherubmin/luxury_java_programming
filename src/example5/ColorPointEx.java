//(x,y)의 한 점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는 ColorPoint 클래스를 만들고 활용해보자.
package example5;

class Point {
    private int x, y; //한 점을 구성하는 x, y 좌표
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() { //점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.setColor("red");
        cp.showColorPoint();
    }
}
