package j01_basic;

import java.util.Scanner;

public class J13OperatorEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //급여를 입력받아 급여가 100불 미만이면 보너스를 급여의 20% 지급
        //100불 이상이면 보너스를 급여의 10% 지급히는 프로그램 작성

        //1. 급여 입력받기
        System.out.println("급여는->");
        //double salary = Double.parseDouble(scan.nextLine()); // 실수가 필요할때
        int salary = Integer.parseInt(scan.nextLine());

        double bonus = (salary >= 100) ? salary*0.1 : salary*0.2;
        System.out.println("보너스는 "+ bonus + "이다.");
    }

}
