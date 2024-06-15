//4 X 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라.
//동일한 정수가 있어도 상관없다.
//나머지 6개의 숫자는 모두 0이다.
//만들어진 2차원 배열을 화면에 출력하라.
package testchallenge3;

import java.util.Random;

public class test10 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Random rand = new Random();
        int count = 0;

        //2차원 배열에 1에서 10까지의 정수 10개를 랜덤하게 삽입
        while (count < 10) {
            int row = rand.nextInt(4);
            int col = rand.nextInt(4);

            //배열의 해당 위치가 0이면 랜덤 값을 삽입
            if (arr[row][col] == 0) {
                arr[row][col] = rand.nextInt(10) + 1;
                count++;
            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
