/*
반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자.
1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
 */
package testchallenge3;

public class test13 {
    public static void main(String[] args) {
        for (int i=0; i < 100; i++) {
            int lastDigit = i % 10;
            int firstDigit = i / 10;
            if (lastDigit == 3 || lastDigit == 6 || lastDigit == 9) {
                if (firstDigit == 3 || firstDigit == 6 || firstDigit == 9) {
                    System.out.println(i + " 박수 짝짝");
                }else System.out.println(i + " 박수 짝");
            }

            if (firstDigit == 3 || firstDigit == 6 || firstDigit == 9) {
                if (lastDigit == 0 || lastDigit == 1 || lastDigit == 2 || lastDigit == 4 || lastDigit == 5
                        || lastDigit == 7 || lastDigit == 8) {
                    System.out.println(i + " 박수 짝");
                }
            }


        }
    }
}
