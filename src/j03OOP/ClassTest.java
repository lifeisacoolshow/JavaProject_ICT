//첫번째 문장으로 package(예약어) 표기
package j03OOP;

//import : 현재 package 내의 클래스가 아닌 다른 package에 있는 클래스를 사용할때 클래스가 있는 위치를 알려줌
//         java.lang package의 클래스는 별도로 import하지 않아도 컴파일시 컴파일러가 import를 자동으로 해줌

import java.lang.System;
import java.util.Random;
import java.lang.String;
//접근제한자: public, protected, default, private
public class ClassTest {
    //멤버변수= 전역변수: 현재 클래스 내에서는 접근을 허용하는 멤버변수
    //변수= field
    //멤버변수는 값을 대입하지 않을 경우 초기값을 가진다. 정수=0, 실수=0.0, 논리=false, 객체형=null
    int a;
    String name;
    int b = 200;
    Random ran = new Random();//객체생성
    int n;
    // System.out.println("객체 테스트중")

    //생성자(constractor) 메소드: 기능구현가능 -> 객체를 생성할때 1번 실행된다.
    //클래스명과 생성자메소드명은 같아야 한다.
    //생성자 메소드는 반환형이 없다.
    public ClassTest() {
        //변수선언, 연산, 다른 객체를 이용하여 기능 구현을 할 수 있다.
        int userNum = 1234;
        System.out.println("ClassTest()의 생성자 메소드 실행됨.");
        System.out.println("userNum=" + userNum);
        System.out.println("b=" + b);
    }

    public ClassTest(int n) {
        this.n = n;//this: 현재 클래스, 멤버변수와 지역변수명이 같을때 멤버변수를 지정하는 예약어이다.
        a = n;
        System.out.println("ClassTest(int n)생성자 메소드" + n);
    }

    public ClassTest(String userName) {
        System.out.println("ClassTest(String userName)생성자 메소드");
    }

    public ClassTest(int n, String userName) {
        System.out.println("ClassTest(int n, String userName)생성자 메소드");
    }

    //메소드: 일반 기능을 구현
    //명령어와 객체생성등으로 기능을 구현한다.
    //호출할때만 실행된다.
    //nextInt(), println(), print(), printf().....
    /* 반환형 메소드명(생략 || 매개변수){

          }*/
    //1~100까지 합을 구하는 기능을 가진 메소드를 생성
    //void : 반환할 값이 없음
    //반환값이 있을 경우 반환할 데이터 타입을 기술함
    public void sum() {
        //메소드 호출시 실행할 실행문을 기술
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println("total=" + total);
    }

    public int sumResult(int max) {
        int total = 0;
        for (int i = 1; i <= max; i++) {
            total += i;
        }
        return total;
    }

    //내부클래스
}
