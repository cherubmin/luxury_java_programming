/*
다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
int score [] = {95, 88, 76, 62, 55};
그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라.
"그만"을 입력받으면 종료한다.
 */
package testchallenge3;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int score [] = {95, 88, 76, 62, 55};

        Scanner sc = new Scanner(System.in);
        String input; //이런식으로도 사용 가능

        while (true) {
            System.out.print("과목 이름을 입력하세요 (\"그만\"을 입력하면 종료): ");
            input = sc.nextLine();

            if (input.equals(("그만"))) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            boolean found = false;
            for (int i = 0; i < course.length; i++) {
                if (input.equals(course[i])) {
                    System.out.println(input + "의 점수는 " + score[i] + "점 입니다.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("해당 과목을 찾을 수 없습니다.");
            }
        }
    sc.close();
    }
}
