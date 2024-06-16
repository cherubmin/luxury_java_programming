//static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기를 만들어보자.
package example4;
//static 메소드는, 객체 없이도 존재하기 때문에, this를 사용할 수 없다.
import java.util.Scanner;

class CurrencyConverter {
    private static double rate; //1$에 대한 원화
    public static double toDollar(double won) {
        return won / rate;
    }
    public static double toKWR(double dollar) {
        return dollar * rate;
    }
    public static void setRate(double r) {
        rate = r; //환율 설정. 원/$1
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("환울(1달러)>> ");
        double rate = sc.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) +
                "입니다.");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
        sc.close();
    }
}
