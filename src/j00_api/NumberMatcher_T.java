package j00_api;

import java.util.Scanner;

public class NumberMatcher_T {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1~100까지 난수를 생성하여 맞추는 게임
        //1.난수생성
        int ranNum = (int)(Math.random()*100)+1;
        int cnt = 0;//입력횟수 누적할 변수
        do{
            //2.숫자입력
            System.out.print("1~100사이의 정수를 입력하세요=");
            int inData = scan.nextInt();
            cnt++;

            //3.난수와 입력받은 값을 비교
            if(ranNum==inData){//같을때
                System.out.println("맞추었습니다. 난수="+ranNum);
                System.out.println(cnt+"번만에 맞추었습니다.");
                break;
            } else if (ranNum > inData) {//난수가 클때
                System.out.println("더 큰값을 입력하세요.");
            } else if (ranNum < inData) {//난수가 작을때
                System.out.println("더 작은값을 입력하세요.");
            }
        }while(true);
    }
}
