//정수를 몇 개 저장할 지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고,
//이곳에서 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
//배열에는 같은 수가 없도록 하고 배열을 출력하라.
package testchallenge3;

import java.util.Scanner;
import java.util.HashSet;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 몇개? ");
        int n = sc.nextInt();

        // 입력된 수가 100보다 큰 경우 예외 처리
        if (n >= 100) {
            System.out.println("100보다 작은 수를 입력하세요.");
            return;
        }

        int[] arr = new int[n];
        HashSet<Integer> usedNumbers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int j;
            // 중복되지 않는 숫자를 찾을 때까지 반복
            do {
                j = (int) (Math.random() * 100 + 1);
            } while (usedNumbers.contains(j));

            arr[i] = j;
            usedNumbers.add(j);
        }

        // 배열의 값 출력
        System.out.print("배열의 값: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
