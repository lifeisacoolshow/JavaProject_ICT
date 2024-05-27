package j01_basic;

import java.util.Scanner;

public class J24For {
    public static void main(String[] args) {

        //반복문
        /*
        최종값에 설정된 조건에 참일 때 블럭내의 실행문이 실행
        for(초기값; 최종값; 증가값;) {
          실행문;
          }

         */

        //1~5까지 1줄에 숫자 1개씩 출력
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("-----------");
        //5~1까지 출력
        for(int i = 5; i>=1; --i) {
            System.out.println(i);
        }

        System.out.println("-----------");
        //1~10까지 짝수 출력
        for(int x = 2; x<=10; x+=2) {
            System.out.println(x);
        }

        System.out.println("-----------");
        //1~10까지 홀수 출력
        for(int j = 1; j<10; j+=2) {
            System.out.println(j);
        }

    }
}