package j06Exception;
//사용자정의 예외클래스 만들기
//1.Exception, RuntimeException을 상속받아 만든다.
//2.클래스명은 마지막단어 Exception을 붙인다.
public class MyException extends Exception{
    //생성자메소드
    public MyException(){
        super("1~100사이의 값이 아닙니다.");
    }
    public MyException(String msg){
        super(msg);
    }
}
