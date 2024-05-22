package j01_basic;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수입력(1~49) ");
        int max = scan.nextInt();
        if (max % 2 == 0) max++;
        //max가 짝수이면 홀수로 만들기
        char c = 'A';//출력할 문자
        int step = 2;
        for (int i = 1; i >= 1; i = i + step) {//1,3,5,7,9,,
            //공백
            for (int s = 1; s <= (max - i) / 2; s++) {//1,2,3,4,5,6,,,,12
                System.out.print(" ");
            }
            //문자출력
            for (int j = 1; j <= i; j++) {
                System.out.print(c++);
                if (c > 'Z') c = 'A';//'Z'보다 크면 'A'로 초기화
            }
            System.out.println();
            //1줄에 출력한 문자의 수가 max와 같으면 step의 값을 -2로 변경한다.
            if (i == max) step = -2;
        }
    }
}
