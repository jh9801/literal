package com.ohgiraffers.section01.literal;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>");
        String name = in.nextLine();
        System.out.println("안녕하세요." + name + "님. 반갑습니다.");
        in.close();

    }
}
