package j03OOP;

import java.util.Scanner;

public class Gugudan {
    Calculator cal = new Calculator();
    public Gugudan(){}
    //단입력
    public int inData(){
        Scanner scan = new Scanner(System.in);
        System.out.print("단입력=");
        return Integer.parseInt(scan.nextLine());
    }

    //구구단 전체출력메소드
    public void gugudanAll(){
        for(int dan=1; dan<=9; dan++){
            for(int i=2; i<=9; i++){
                int result = cal.multiple(dan, i);
                output(dan, i, result);
            }
        }
    }

    //해당단 출력메소드
    public void gugudan(int dan){
        for(int i=1; i<=9; i++){
            int r = cal.multiple(dan, i);
            output(dan, i, r);
        }
    }

    //단출력
    public void output(int a, int b, int c){
        System.out.println(a+"*"+b+"="+c);
    }
}
