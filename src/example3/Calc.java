//사용자가 명령행에 입력한 실수들을 main() 메소드에서 전달받아 합을 구하는 프로그램을 작성하라.
package example3;

public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }

        System.out.println("sum = " + sum);
    }
}
