//인터페이스를 구현하고 동시에 슈퍼 클래스를 상속받는 사례
package example5;

interface PhoneInterface1 {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}
interface MobilePhoneInterface extends PhoneInterface1 {
    void sendSMS();
    void receiveSMS();
}
interface MP3Interface {
    public void play();
    public void stop();
}
class PDA {// 클래스 작성
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~~");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }
    @Override
    public void sendSMS() {
        System.out.println("문자갑니다.");
    }
    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요");
    }
    @Override
    public void play() {
        System.out.println("음악 연주합니다");
    }
    @Override
    public void stop() {
        System.out.println("음악 중단합니다.");
    }

    public void schedule() {
        System.out.println("일정 관리합니다.");
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
        phone.schedule();
    }
}
