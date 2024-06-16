//다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
package testchallenge4;

class Retangle {
    int x, y, width, height;

    public Retangle(int x, int y, int width, int height) {
    }

    int square() {

    }
}

public class test4 {
    public static void main(String[] args) {
        Retangle r = new Rectangle(2, 2, 8, 7);
        Retangle s = new Rectangle(5, 5, 6, 6);
        Retangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.")
    }
}
