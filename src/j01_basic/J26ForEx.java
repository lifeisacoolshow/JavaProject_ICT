package j01_basic;

import java.util.Scanner;

public class J26ForEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수= ");
        int n= scan.nextInt();

        int oddSum = 0;
        for ( int i=1; i<=n; i+=2) {
            oddSum += i;
        }
        System.out.println("1~"+n +"까지의 합은 "+oddSum);
    }

}
/*
실행
정수=15
1~15까지의 홀수의 합은 ~~
 */
