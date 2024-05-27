package j00_api;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // java.util.Scanner import하기
        // 콘솔에서 1줄, 문자열, 정수, 실수를 입력받을 수 있는 기능을 제공한다.
        Scanner scan = new Scanner(System.in);

        // 정수값을 읽어오기
       /* System.out.print("정수= ");
        int num= scan.nextInt();
        int result= num*2;
        System.out.println("num=" + num + ", result=" + result);
        */

        System.out.print("문자= ");
        String txt = scan.next(); // enter 포함한 한줄 입력
        System.out.println("txt= "+txt);

        int txtInt = Integer.parseInt(txt);
        System.out.println("txtInt= "+ (txtInt * 3));

    }
}