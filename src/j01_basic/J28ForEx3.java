package j01_basic;

import java.util.Scanner;

import java.util.Scanner;

public class J28ForEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("단= ");
        int dan = scan.nextInt();


        if(dan>=2 && dan<=9){//2~9단 사이의 값인지 확인
            //구구단
            for(int i =2;i<=9;i++){
                int result = dan * i;
                System.out.printf("%2d * %2d = %2d\n", dan, i, result);
            }
        }else{//잘못된 단일때
            System.out.println("잘못된 단을 입력했습니다.");
        }
    }
}