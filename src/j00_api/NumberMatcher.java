package j00_api;

import java.util.Scanner;

public class NumberMatcher {
    public static void main(String[] args) {
        //1~100사이의 난수를 만들어 맞추는 게임
        Scanner scan = new Scanner(System.in);
        System.out.println("===숫자맞추기게임===");
        //랜덤뽑기
        int ranNum = (int)(Math.random()*100)+1;
        //사용자 숫자입력
        System.out.print("1~100사이의 정수를 입력하세요.?=");
        int userNum = scan.nextInt();

        for(int i=1;i<=100;i++){
            if(userNum>ranNum){
                System.out.println("더 작은 값을 입력하세요.");
                userNum = scan.nextInt();
            } else if (userNum<ranNum) {
                System.out.println("더 큰 값을 입력하세요.");
                userNum = scan.nextInt();
            } else {
                System.out.println("정답입니다.");
                System.out.println(i+"번만에 맞췄습니다.");
                break;
            }
        }
    }
}
