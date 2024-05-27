package j01_basic;

import java.util.Scanner;

public class J12OperatorEx2 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);

        String textInt = scan.nextLine();
        String result = (textInt%2==0)? "짝수" : "홀수";
        System.out.println("은" + result + "입니다.");

         */
        Scanner s = new Scanner(System.in); //객체생성
        // 임의 정수를 입력받아 양, 음, 0 으로 구별하여 출력하라.
        int inData = s.nextInt();

        String result = (inData>0)?"양수":(inData<0)?"음수":"0";
        System.out.println(inData+"은 "+ result + "입니다.");

    }
}
