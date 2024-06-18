//instanceof 연산자를 이용하여 상속 관계에 따라 레퍼런스가 가리키는 객체의 타입을 알아본다.
package example5;

class Person1{}
class Student1 extends Person1{}
class Researcher1 extends Person1{}
class Professor1 extends Researcher1{}

public class InstanceOfEx {
    static void print(Person1 p) {
        if(p instanceof Person1)
            System.out.print("Person ");
        if(p instanceof Student1)
            System.out.print("Student ");
        if(p instanceof Researcher1)
            System.out.print("Researcher ");
        if(p instanceof Professor1)
            System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student1());
        System.out.print("new Researcher() ->\t"); print(new Researcher1());
        System.out.print("new Professor() ->\t"); print(new Professor1()); //new Professor() 객체는
        //Person 타입이기도 하고, Researcher, Professor 타입이기도 함.

    }
}