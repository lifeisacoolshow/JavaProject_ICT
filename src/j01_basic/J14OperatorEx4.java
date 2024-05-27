package j01_basic;

import java.util.Scanner;

public class J14OperatorEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //사과의 개수와 바구니크기를 입력받아 필요한 바구니의 개수를 구하는 프로그램

        //1. 과일갯수 입력받기
        System.out.println("과일갯수는 ");
        int fruits = scan.nextInt();

        //2. 바구니크기 입력받기
        System.out.println("바구니크기는 ");
        int basketSize = scan.nextInt();

        //3. 바구니 개수 구하기
        int count = (fruits/basketSize == 0) ? (fruits/basketSize) : (fruits/basketSize+1);
        System.out.println("바구니 개수는 "+ count + "이다.");
    }

}
