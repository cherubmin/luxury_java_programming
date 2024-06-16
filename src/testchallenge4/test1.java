//자바 클레스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
package testchallenge4;

class TV {
    String company;
    int year;
    int inch;

    TV(String company, int year, int inch) {
        this.company = company;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println(company + "에서 만든 " + year + "년형" + inch + "인치 TV");
    }
}

public class test1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
