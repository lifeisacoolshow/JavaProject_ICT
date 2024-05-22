package j01_basic;

import java.util.Scanner;

public class J34ForEX {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //공백
            for(int space=1;space<=5-i;space++){
                System.out.print(" ");
            }
            //*
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for(int i=1;i<=9;i+=2){
            for(int space=1; space<=(9-i)/2; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("홀수입력= ");
        int max = scan.nextInt();
        for(int i=max;i>=1;i-=2){
            for(int space=1; space<=(max-i)/2; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
