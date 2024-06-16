//클래스 Person을 아래와 같은 필드를 갖도록 선언하고, 클래스 Student는 Person을 상속받아 각 멤버 필드에 값을 저장하라.
package example5;

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}

class Student extends Person {
    public void set(){
        age = 30;
        name = "홍길동";
        height = 175;
        //weight는 접근 불가
        setWeight(99);
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}
