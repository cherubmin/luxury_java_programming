//다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
package testchallenge5;

class TV{
    private int size;
    public TV(int size) {this.size = size;}
    protected int getSize() {return size;}
}
public class ColorTV extends TV{
    private int color;
    public ColorTV(int Size, int color){
        super(Size);
        this.color = color;
    }
    public void printProperty(){
        System.out.println(super.getSize() + "인치 " + color + "컬러");
    }
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
