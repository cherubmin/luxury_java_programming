/*
다음과 같이 작동하는 Average.java를 작성하라. 명령행 인자는 모두 정수만 사용되며 정수들의 평균을 출력한다.
다음 화면은 컴파일된 Average.class 파일을 c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다.
원본 Average.class 파일은 이클립스의 프로젝트 폴더 밑에 bin 폴더에 있다.
 */
package testchallenge3;

public class test11{
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        System.out.print(sum / args.length);
    }
}
