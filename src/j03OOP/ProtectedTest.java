package j03OOP;

public class ProtectedTest {
    //protected 접근제한자는 필드, 생성자메소드, 메소드에 표기
    //패키지가 같으면 접근을 허용
    //패키지가 다르면 반드시 상속받아 사용
    protected int num = 3456;
    public ProtectedTest(){}
}
