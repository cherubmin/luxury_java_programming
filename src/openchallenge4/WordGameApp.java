/*
n명이 참가하는 끝말잇기 게임을 만들어보자.
처음 단어는 "아버지"이다.
n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다.
끝말잇기에서 끝말이 틀린 경우 게임을 끝내고 게임에서 진 참가자를 화면에 출력한다.
프로그램에서는 시간 지연을 구현하지 않아도 된다.
이 문제의 핵심은 여러 개의 객체와 배열 사용을 연습하기 위한 것으로,
main()을 포함하는 WordGameApp 클래스와 각 선수를 나타내는 Player 클래스를 작성하고, 실행 중에는 WordGameApp 객체 하나와
선수 숫자만큼의 Player 객체를 생성하는데 있다.
 */
package openchallenge4;

import java.util.Scanner;

class Player{
    String name;
    String word;

    Player(String str){
        name = str;
    }

    void getWordFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println(name + ">>");
        word = sc.nextLine();
    }

    boolean checkSuccess(String str){
        if(str.charAt(str.length()-1) == word.charAt(0))
            return true;
        return false;
    }
}


public class WordGameApp {

    int people;
    Player p[];
    String cur;

    WordGameApp(){
        cur = "아버지";
    }

    void run(){
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.println("게임에 참가하는 인원은 몇명입니까>>");
        Scanner sc = new Scanner(System.in);
        people = sc.nextInt();
        p = new Player[people];
        for (int i = 0; i < people; i++) {
            String str;
            System.out.println("참가자의 이름을 입력하세요>>");
            str = sc.next();
            p[i] = new Player(str);
        }
        System.out.println("시작하는 단어는 아버지입니다.");
        int idx = 0;
        while(true)
        {
            p[idx].getWordFromUser();
            if(p[idx].checkSuccess(cur)){
                cur = p[idx].word;
            }
            else {
                System.out.println(p[idx].name + "이 졌습니다.");
                break;
            }
            idx = (idx+1)%people;

        }
    }



    public static void main(String[] args) {
        WordGameApp wg = new WordGameApp();
        wg.run();
    }
}