package j01_basic;

//콘솔에서 두 수를 입력받아 두 수가 모두 양수이면 합차곱몫을 구하는 프로그램

import java.util.Scanner;

public class J16IfEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. 첫번째 수 입력받기
        System.out.println("첫번째수= ");
        int a = scan.nextInt();

        //2. 두번째 수 입력받기
        System.out.println("두번째수= ");
        int b = scan.nextInt();

        //3. a>0, b>0 이면 합차곱 몫 구하기
        /*if (a>0 & b>0){
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
        }*/ //--->my answer

        if (a>0 && b>0) {
            int plus = a + b;
            int minus = a - b;
            int multi = a * b;
            int divide = a / b;
            System.out.printf(" %d + %d = %d\n %d - %d = %d\n %d * %d = %d\n %d / %d = %d\n"
                    , a, b, plus, a, b, minus, a, b, multi, a, b, divide);
        }
        System.out.println("무조건 실행됨."); //--->T's solution
    }

}
