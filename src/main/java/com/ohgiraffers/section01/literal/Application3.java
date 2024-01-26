package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        //문자열 합치기 결과 예측하고 사용하기
        //두개의 문자 합치기부터 봄
        System.out.println("두개의 문자 합치기");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        // 2. 세 개의 문자열 합치기
        System.out.println("세 개의 문자열 합치기");
        System.out.println(9 + 9 + "9");
//        System.out.println(9 + 9 * "9"); 안됨
        System.out.println(9 * 9 + "9");//819

        System.out.println(9 + "9" + 9);//999
        System.out.println("9" + 9 + 9);//999
        // 앞에 열을 취급하기 때문에 뒤에도 따라 문자로 취급 그래서
        // 결과값이 999
        System.out.println("9" + (9 + 9));//918
        // 999로 출력

        System.out.println("10과 20의 합" + (10 + 20));
        System.out.println("10과 20의 합" + 10 + 20);
        // 문자열이 되기때문에 ()를 씌워줘야한다
        System.out.println("10과 20의 차 :" + (10 - 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");
        //왼쪽 > 오른쪽으로 연산이 되니깐 문자와 문자열

    }
}
