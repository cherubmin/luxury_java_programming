//다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
package testchallenge4;

class Rectangle {
    int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ") 에서 크기가 " + width + " x " + height + "인 사각형 ");
    }

    boolean contains(Rectangle r) {
        if(this.x <= r.x && this.y <= r.y && this.square() >= r.square()) {
            return true;
        }
        else return false;
    }
}

public class test4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
