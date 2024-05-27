package j01_basic;

import java.util.Scanner;

public class J23SwitchEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("국어점수= ");
        int kor = scan.nextInt();
        System.out.println("영어점수= ");
        int eng = scan.nextInt();
        System.out.println("수학점수= ");
        int mat = scan.nextInt();

        int total = kor + eng + mat;
        double avg = (double) total / 3;

        int num = (int)avg/10;
        switch (num) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
        System.out.println("총점= "+total);
        System.out.println("평균= "+avg);

    }
}