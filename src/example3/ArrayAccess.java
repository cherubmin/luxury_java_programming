//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
package example3;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[5];
        int max = 0; //현재 가장 큰수

        System.out.println("양수 5개를 입력하세요.");
        for(int i = 0; i < 5; i++) {
            intArray[i] = sc.nextInt();
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}
