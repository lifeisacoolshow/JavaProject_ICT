package j01_basic;

import java.util.Scanner;

public class J19IfElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //정수를 입력받아 0보다 크면 100을 곱하여 출력하고
        //             0보다 작으면 양수로 만들어 200을 곱하여 출력하고
        //             0일때는 0을 출력하는 프로그램
        System.out.println("정수= ");
        int n = scan.nextInt();

        if (n>0){
            int result = n*100;
            System.out.println("n="+ result);
        }else {
            if (n<0){
                int result2 = -n * 200;
                System.out.println("n="+ result2);
            }else {
                System.out.println("n=0");
            }
        }

    }
}