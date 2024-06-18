//다음은 단위를 변환하는 추상 클래스 Converter이다.
package testchallenge5;

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src); //추상 메서드
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio; //비율

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다");
        sc.close();
    }
}
