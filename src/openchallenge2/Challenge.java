//두 사람이 하는 가위바위보 게임을 만들어보자. 두 사람의 이름은 "철수"와 "영희"이다.
//먼저 "철수 >>"를 출력하고 "가위", "바위", "보" 중 하나를 문자열로 입력받는다.
//그리고 "영희 >>"를 출력하고 마찬가지로 입력받는다.
//입력받은 문자열은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.
package openchallenge2;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("가위, 바위, 보 중에서 입력하세요");
        System.out.println("철수 >>");
        String first = sc.next();
        System.out.println("영희 >>");
        String second = sc.next();

        if (first.equals(second)) {
            System.out.println("무승부입니다.");
        } else if ((first.equals("가위") && second.equals("보")) || (first.equals("바위") && second.equals("가위"))
                ||(first.equals("보") && second.equals("바위"))) {
            System.out.println("철수가 이겼습니다.");
        } else
            System.out.println("영희가 이겼습니다.");
    }

}
