package j01_basic;

import java.util.Scanner;

public class J38WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            //정수입력
            System.out.print("정수=");
            int n = scan.nextInt();

            //홀수, 짝수 합 (1~n까지)
            int i = 1;
            int oddSum = 0;
            int evenSum = 0;

            while(i<=n){
                if(i%2 == 0) evenSum+=i;
                else oddSum+=i;
                i++;
            }

            //홀수, 짝수 합 출력
            System.out.println("홀수의 합="+oddSum);
            System.out.println("짝수의 합="+evenSum);
        }
    }
}
