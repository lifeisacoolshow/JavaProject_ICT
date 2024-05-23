package j03OOP;

public class Calculator {
    //멤버변수
    //생성자메소드
    public Calculator(){}
    //메소드
    //더하기 메소드
    public int plus(int x, int y){
        int result = x + y;
        return result;
    }
    public int minus(int x, int y){
        return x-y;
    }
    public int multiple(int x, int y){
        return x*y;
    }
    public int divide(int x, int y){
        return x/y;
    }
}
