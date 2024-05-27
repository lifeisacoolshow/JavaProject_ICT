package j01_basic;

import java.util.Scanner;

public class J25For {
    public static void main(String[] args) {
        //1~100까지의 합을 구하는 반복문
        int i = 0; //1,2,3,4,...100
        int sum = 0; //합누적
        for(i=1; i<=100; i++){
            sum = sum + i;
            if(i%10==0){//i가 10의 배수일 때 출력
                System.out.println("1~"+i+"까지의 합은"+sum);
            }
        }
        //System.out.println("1~100까지의 합="+sum);
    }
}