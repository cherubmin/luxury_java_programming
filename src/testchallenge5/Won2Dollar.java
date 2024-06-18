//Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라.
//main() 메소드와 실행 결과는 다음과 같다.
package testchallenge5;

public class Won2Dollar extends Converter {
    private int oneDollar;
    public Won2Dollar(int oneDollar) {
        this.oneDollar = oneDollar;
    }
    protected double convert(double src) {return src / oneDollar;}
    protected String getSrcString() {return "원";}
    protected String getDestString() {return "달러";}


    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}
