//노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
package testchallenge4;

class Song{
    String title;
    String artist;
    int year;
    String country;

    public Song() {//기본 생성자와 매개변수를 가지는 생성자

    }

    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}

public class test3 {
    public static void main(String[] args) {
        Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        song.show();
    }
}
