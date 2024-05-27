package j01_basic;

import java.util.Scanner;

public class J21Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //switch문은 범위가 없는 조건문

        //콘솔에서 입력받은 정수가 1:빨강, 2:노랑, 3:파랑, 4:초록, 그 외의 잘못된 컬러정보이다.
        //구별하여 출력하라.

        System.out.println("정수= ");
        int num = scan.nextInt();
        switch(num){
            case 1 : //num값이 1일때 실행문
                System.out.println(num+"은 빨강입니다.");
                break; //break는 생략이 가능함. 생략하면 다음 case로 실행이 이동
            case 2 : //num값이 2일때 실행문
                System.out.println(num+"은 노랑입니다.");

            case 3 : //num값이 3일때 실행문
                System.out.println(num+"은 파랑입니다.");
                break;
            case 4 : //num값이 4일때 실행문
                System.out.println(num+"은 초록입니다.");
                break;
            default:
                System.out.println(num+"은 잘못된 컬러정보입니다.");
        }

    }
}
