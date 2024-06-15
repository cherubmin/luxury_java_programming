//반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라. 그리고 객체가 생성된 모습을 그려보라.
package example4;

public class Circle {
    int radius;
    String name;

    public Circle() { //생성자 이름은 클래스 이름과 동일 //생성자는 리턴 타입 없음
        radius = 1; name = ""; //필드 초기화
    }

    public Circle(int r, String n) { //생성자 이름은 클래스 이름과 동일 //생성자는 리턴 타입 없음
        radius = r; name = n; //매개 변수로 필드 초기화
    }

    public double getArea() {// 원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea(); //처음 사용이므로 변수 선언과 초기화
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle(); //=Circle donut; donut = new Circle(); //객체 생성, 반지름을 1, 이름을 ""로 초기화
        donut.name = "자바도넛"; //이름 변경
        area = donut.getArea(); //두번째 사용이므로 초기화 할 필요 없음
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
