package testchallenge5;

public class IPTV extends ColorTV {
    private String address;
    public IPTV(String address, int size, int color) {
        super(size, color);
        this.address = address;
    }
    public void printProperty() {
        System.out.print("나의 IPTV는 " + address + "주소의 ");
        super.printProperty();
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048 컬러

        iptv.printProperty();
    }
}
