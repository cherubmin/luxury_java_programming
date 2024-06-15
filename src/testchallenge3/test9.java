//4 X 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고
//2차원 배열을 화면에 출력하라.
package testchallenge3;

import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int rand = (int)(Math.random()*10 + 1);
                arr[i][j] = rand;
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
