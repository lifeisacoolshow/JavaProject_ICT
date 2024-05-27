package j01_basic;

import java.util.Scanner;

public class MoreBigger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째수=");
        int first = scan.nextInt();
        System.out.println("두번째수=");
        int second = scan.nextInt();
        if(first>second){
            System.out.println("큰값=");
            System.out.println(first);
        } else if (first<second) {
            System.out.println("큰값=");
            System.out.println(second);
        } else if (first==second) {
            System.out.println("값이 동일합니다.");
        }
    }
}