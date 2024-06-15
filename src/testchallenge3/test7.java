//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
//그리고 배열에 든 숫자들과 평균을 출력하라.
package testchallenge3;

public class test7 {
    public static void main(String[] args) {
        int []array = new int[10];
        double sum = 0;

        for (int j = 0; j < 10; j++){
            int i = (int)(Math.random()*10 + 1);
            array[j] = i;
            System.out.print(array[j] + " ");

            sum += array[j];
        }
        System.out.println();
        System.out.println("평균은 : " + (sum/10));


    }
}
