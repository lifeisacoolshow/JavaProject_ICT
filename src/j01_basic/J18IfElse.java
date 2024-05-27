package j01_basic;

import java.util.Scanner;

public class J18IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //if else 문으로 짝수, 홀수구하기
        System.out.println("양의 정수= ");
        int n = scan.nextInt();

        if(n%2 == 1){//홀수
            System.out.println("홀수입니다.");
        }else {//짝수
            System.out.println("짝수입니다.");
        }
    }
}

/*if(조건식){
    조건식이 참일 때 실행
        }else{
    조건식이 거짓일 때 실행
        }*/