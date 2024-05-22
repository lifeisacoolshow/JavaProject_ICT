package j01_basic;

import java.util.Scanner;

public class J33MoneyCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //금액입력
        System.out.println("금액을 입력하세요.");
        int money = scan.nextInt();//254832

        //화폐의 초기값
        int won = 50000;

        //다음화폐 단위를 만들기 위한 값
        int next = 5;

        for (;money>0;) {
            int cnt = money / won;
            if (cnt > 0) {
                System.out.printf("%d원=%d", won, cnt);
                if (won >= 1000) System.out.printf("장\n");
                else System.out.printf("개\n");
                //현재금액만큼 빼기
                money = money - cnt * won;
            }

            //다음화폐단위 계산
            won = won / next; //10000
            if(next==5)next=2;
            else next=5;
        }


    }
}

/*
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
        System.out.println("1원="+n+"개");*/
