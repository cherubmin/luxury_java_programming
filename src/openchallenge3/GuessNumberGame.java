//숨겨진 카드의 수를 맞추는 게임을 만들어보자. 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임이다.
//아래의 화면과 같이 카드 속의 수가 77인 경우를 보자.
//수를 맞추는 사람이 55라고 입력하면 "더 높게", 다시 70을 입력하면 "더 높게"라는 식으로 범위를 좁혀가면서 수를 맞춘다.
//게임을 반복하기 위해 y/n을 묻고, n인 경우 종료된다.
package openchallenge3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("숫자 맞추기 게임 시작");

        while (playAgain) {
            int hiddenNumber = random.nextInt(100);
            int guess = -1;
            System.out.println("\n0에서 99사이의 숫자를 맞춰보세요!");
            System.out.println("숫자를 입력하세요");

            while (guess != hiddenNumber) {
                guess = sc.nextInt();

                if (guess > hiddenNumber) {
                    System.out.println("더 작게");
                } else if (guess < hiddenNumber) {
                    System.out.println("더 크게");
                } else
                    System.out.println("정답! 정답은 : " + hiddenNumber + "입니다!");
            }
            System.out.println("게임을 다시 하겠습니까? (Y/N): ");
            char answer = sc.next().charAt(0);
            playAgain = (answer == 'Y' || answer == 'y');

        }
        System.out.println("게임을 종료합니다. 감사합니다!");
        sc.close();
    }
}
