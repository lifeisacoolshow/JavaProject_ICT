package j06Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
    Scanner scan = new Scanner(System.in);
    public ExceptionTest1(){

    }
    public void start(){
        //두수를 입력받아 사칙연산
        try {
            System.out.print("정수1->");
            int n1 = scan.nextInt();
            System.out.print("정수2->");
            int n2 = scan.nextInt();

            result(n1, n2);
            ////
            int arr[] = {20, 90, 60, 40};
            System.out.println("arr=>"+arr[arr.length-1]);

        }catch (InputMismatchException ime){
            System.out.println("정수를 입력하세요.");
            //System.out.println(ime.getMessage());
           // ime.printStackTrace();
        }catch (ArithmeticException ae){
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("배열의 첨자값이 잘못되었습니다.");
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
        ExceptionTest1 et = new ExceptionTest1();
        et.start();
    }
}
