//다음 코드의 두 클래스 Sample과 AccessEx 클래스는 동일한 패키지에 저장된다. 컴파일 오류를 찾아내고 이유를 설명하라.
package example4;

class Sample {
    public int a;
    private int b;
    int c; //디폴트 접근 지정
}

public class AccessEx {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 10;
        //sample.b = 10; //private
        sample.c = 10;
    }
}
/*
Sample 클래스의 필드 b는 private 멤버로서 Sample 클래스 외 다른 어떤 클래스에서도
읽고 쓸 수 없기 때문에 라인 14에서 오류 발생.
 */
