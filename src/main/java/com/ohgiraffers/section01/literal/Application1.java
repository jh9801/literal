package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        // 주석
        /* 주석 */
        // 숫자 형태의 값
        // 정수 형태의 값 출력
        System.out.println(123);
        /*
        *
        *
        *
        *
        * */


        // 실수 형태의 값
        System.out.println(1.23);
        // 문자 형태의 값
        System.out.println("한글과영어");
        System.out.println('a');
        // 문자 형태의 값을 홈따옴표로 감싸줘야 한다
        System.out.println('1');
        // 홈따옴표 안       에 감싸져있어 이건 숫자가 아니라 문자이다
//        System.out.println('ab');
        // 두개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');
        //ctrl + / 하면 오류난 것들이 주석으로 설정된다

        // 홈따옴표도 error가 뜬다
        System.out.println("잠온다");

        // 문자열 형태의 값 출력
        System.out.println("ab");
        System.out.println("123");  // 정수지만 문자열이다
        System.out.println("a");    // 문자열 이고
        System.out.println('a');    //문자 형태

        //논리 형태
        System.out.println(true);
        System.out.println(false);  //ture 혹은 false 논리형




    }
}
