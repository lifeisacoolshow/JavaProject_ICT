package j01_basic;

import java.util.Scanner;

public class J22SwitchEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("원하는 메뉴를 선택\n(1.사각형의 넓이, 2.원의 넓이)");
        int num = scan.nextInt();
        switch (num){
            case 1 :
                System.out.println("가로= ");
                int width = scan.nextInt();
                System.out.println("세로= ");
                int height = scan.nextInt();
                int result = width * height;
                System.out.println("사각형의 넓이= "+ result);
                break;
            case 2 :
                System.out.println("반지름= ");
                int radius = scan.nextInt();
                double result2 = radius*radius*Math.PI;
                System.out.println("원의 넓이= "+ result2);
                break;
            default:
                System.out.println("잘못된 입력값입니다.");
        }

    }
}