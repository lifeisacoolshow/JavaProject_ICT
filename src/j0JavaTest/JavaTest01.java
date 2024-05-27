package j0JavaTest;

import java.util.Scanner;

//홀수, 짝수 전체의 합 J27ForEx
public class JavaTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수는= ");
        int max = scan.nextInt();
        int sum = 0; //전체합누적
        int oddSum = 0; //홀수합누적
        int evenSum = 0; //짝수합누적
        for(int i=1; i<=max; i++){// i=1,2,3,...max
            sum+=i ;//전체합
            if(i%2==1) {//홀수합
                oddSum += i;
            }else {//짝수합
                evenSum += i;
            }
        }
        System.out.printf("1~%d까지의 홀수합은 %d\n", max, oddSum);
        System.out.printf("1~%d까지의 짝수합은 %d\n", max, evenSum);
        System.out.printf("1~%d까지의 전체합은 %d\n", max, sum);

    }
}
