//Scanner 클래스로 이름, 도시, 나이, 체중, 독신 여부를 입력받고 다시 출력하는 프로그램을 작성하라.
package example2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름은 " + name + ", ");

        String city = scanner.next();
        System.out.println("도시는 " + city + ", ");

        int age = scanner.nextInt();
        System.out.println("나이는 " + age + ", ");

        int height = scanner.nextInt();
        System.out.println("체중은 " + height + ", ");

        boolean isSingle = scanner.nextBoolean();
        System.out.println("독신 여부는 " + isSingle + "입니다.");

        scanner.close();

    }
}
