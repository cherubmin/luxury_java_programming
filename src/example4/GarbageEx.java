//아래 코드에서 언제 가비지가 발생하는지 설명하라.
package example4;

public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;
        d = c;
        c = null;
    }
}//Good이 가비지가 된다.
