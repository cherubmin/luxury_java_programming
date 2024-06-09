package first;

import java.util.Objects;
import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");

        System.out.println("철수 >> ");
        Scanner s1 = new Scanner(System.in);
        String s2 = s1.next();

        System.out.println("영희 >> ");
        Scanner k1 = new Scanner(System.in);
        String k2 = k1.next();

        if(Objects.equals(s2, k2)) {
            System.out.println("무승부");
        }
        //else((s2 == "가위" || k2 == "보")) {

        }

        }



