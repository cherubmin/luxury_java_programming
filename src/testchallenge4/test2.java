//Grade 클래스를 작성해보자. 3 과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 다음과 같다.
package testchallenge4;

import java.util.Scanner;

class Grade {
    int math, science, english;

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average(){
        int sum = math + science + english;
        return sum/3;
    }


}

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
        int math = input.nextInt();
        int science = input.nextInt();
        int english = input.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        input.close();
    }
}
