package j01_basic;

import java.util.Scanner;

public class J20IfEX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 수=");
        int n1 = scan.nextInt();
        System.out.println("두번째 수=");
        int n2 = scan.nextInt();

        if(n1>n2) System.out.println(n1);
        else if (n1<n2) System.out.println(n2);
        else System.out.println("두 수가 같습니다.");
        }
    }

