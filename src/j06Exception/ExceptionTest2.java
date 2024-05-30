package j06Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {
    Scanner scan = new Scanner(System.in);
    public ExceptionTest2(){

    }
    public void start(){
        //두수를 입력받아 사칙연산
        try {
            System.out.print("정수1->");
            //int n1 = scan.nextInt();
            int n1=Integer.parseInt(scan.nextLine()); //7->"7"
            System.out.print("정수2->");
            //int n2 = scan.nextInt();
            int n2=Integer.parseInt(scan.nextLine());

            result(n1, n2);
            ////
            int arr[] = {20, 90, 60, 40};
            System.out.println("arr=>"+arr[arr.length]);

        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("배열의 첨자값이 잘못되었습니다.");
        }catch (Exception e){
            System.out.println("exception으로 예외처리---->"+e.getMessage());
        }finally {
            //try문에서 예외가 발생하든 안하든 무조건 실행된다.
            //생략가능
            System.out.println("finally문은 무조건 실행됨");
        }
    }
    public void result(int a, int b){
        int plus = a + b;
        int minus = a - b;
        int multiple = a * b;
        int divide = a / b;
        System.out.printf("%d + %d = %d\n",a,b,plus);
        System.out.printf("%d - %d = %d\n",a,b,minus);
        System.out.printf("%d * %d = %d\n",a,b,multiple);
        System.out.printf("%d / %d = %d\n",a,b,divide);
    }
    public static void main(String[] args) {
        ExceptionTest2 et = new ExceptionTest2();
        et.start();
    }
}
