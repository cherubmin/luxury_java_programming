//조건 연산자 사례
package example2;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;

        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
    }
}
