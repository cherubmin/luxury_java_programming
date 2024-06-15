//Book 클래스를 활용하여 2개짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하라.
package example4;

import java.util.Scanner;

class book {
    String title, author;
    public book(String title, String author) {//생성자
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book []book = new Book[2];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < book.length; i++) { //book.length = 2
            System.out.print("제목>>");
            String title = sc.nextLine();
            System.out.print("저자>>");
            String author = sc.nextLine();
            book[i] = new Book(title, author); //배열 원소 객체 생성
        }

        for(int i = 0; i < book.length; i++) {
            System.out.println("(" + book[i].title + "," + book[i].author + ")");
        }

        sc.close();
    }
}
