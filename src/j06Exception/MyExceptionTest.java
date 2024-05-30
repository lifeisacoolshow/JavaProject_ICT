package j06Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
    Scanner scan = new Scanner(System.in);
    public MyExceptionTest(){
        start();
    }
    public void start (){
        try{
            //단을 입력받아 해당단을 출력하라.
            System.out.print("단=");//+,=,- (2~9)
            int dan = scan.nextInt();
            if(dan>=2 && dan<=9){//2~9사이 값을 입력한 경우
                gugudan(dan);
            }else{//그 외의 단을 입력한 경우 MyException 예외를 발생시킴
                //강제로 예외를 발생시킴
                throw new MyException("2~9단까지만 허용합니다.");
            }

        }catch (InputMismatchException ime){
            System.out.println("정수를 입력하세요");
        }catch (MyException me){
            System.out.println(me.getMessage());
        }

    }
    public void gugudan(int dan){
        for(int i=2; i<=9; i++){
            System.out.printf("%d * %d = %d\n",dan, i, (dan*i));
        }
    }
    public static void main(String[] args) {
        new MyExceptionTest();
    }
}
