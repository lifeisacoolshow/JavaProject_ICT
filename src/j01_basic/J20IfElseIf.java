package j01_basic;

import java.util.Scanner;

public class J20IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. 데이터입력
        System.out.println("국어점수= ");
        int kor = scan.nextInt();
        System.out.println("영어점수= ");
        int eng = scan.nextInt();
        System.out.println("수학점수= ");
        int math = scan.nextInt();

        //2. 계산하기
        int total = kor + eng + math;
        double avg = (double)total / 3;

        String grade = "";
        if(avg>=90){//A학점
            grade = "A";
        } else if (avg>=80) {//B학점
            grade = "B";
        } else if (avg>=70) {//C학점
            grade = "C";
        } else if (avg>=60) {//D학점
            grade = "D";
        } else {//F학점
            grade = "F";
        }
        System.out.println("총점= "+ total);
        System.out.println("평균= "+ avg);
        System.out.println("학점= "+ grade);
    }
}
/*
국어, 영어, 수학점수를 입력받아 총점, 평균, 학점을 구하라.

90~100 A학점
80~89.99 B학점
70~79.99 C학점
60~69.99 D학점
0~59.99 F학점
*/
