package JavaTestProject;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수는->");
        int max = scan.nextInt();
        int sum = 0;
        int oddSum = 0;
        int evenSum = 0;
        for(int i=1; i<=max; i++){
            sum+=i ;
            if(i%2==1) {
                oddSum += i;
            }else {
                evenSum += i;
            }
        }
        System.out.printf("1~%d까지의 홀수합은 %d\n", max, oddSum);
        System.out.printf("1~%d까지의 짝수합은 %d\n", max, evenSum);
        System.out.printf("1~%d까지의 전체합은 %d\n", max, sum);
    }
}
