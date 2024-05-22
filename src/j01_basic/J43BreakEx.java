package j01_basic;

import java.util.Scanner;

public class J43BreakEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("임의의 정수=");
        int n = scan.nextInt();

        int i = 0;
        int sum = 0;
        while(true){
            i++;
            sum+=i;
            if(sum>n) break;
        }
        System.out.printf("1~%d까지의 합은 %d", i, sum);
    }
}
