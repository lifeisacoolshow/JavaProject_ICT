package j01_basic;

import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //금액입력
        System.out.println("금액을 입력하세요.");
        int price = scan.nextInt();

        int nnnnnn = price/50000;
        int nnnnn = (price-nnnnnn*50000)/1000;
        int nnnn = (price-nnnnnn*50000-nnnnn*1000)/500;
        int nnn = (price-nnnnnn*50000-nnnnn*1000-nnnn*500)/100;
        int nn = (price-nnnnnn*50000-nnnnn*1000-nnnn*500-nnn*100)/10;
        int n = (price-nnnnnn*50000-nnnnn*1000-nnnn*500-nnn*100-nn*10)/1;


        System.out.println("50000원="+nnnnnn+"장");
        System.out.println("10000원="+nnnnn+"장");
        System.out.println("500원="+nnnn+"개");
        System.out.println("100원="+nnn+"개");
        System.out.println("10원="+nn+"개");
        System.out.println("1원="+n+"개");

    }
}