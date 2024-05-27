package j04Inheritance;
//추상클래스는 추상메소드를 1개이상 포함한 클래스이다.
//추상메소드는 접근제한자, 반환형, 메소드명을 정의하고 실행부를 구현하지 않은 메소드이다.
//추상클래스는 new로 객체를 생성할 수 없다.
//반드시 상속받아 추상메소드를 모두 오버라이딩하여 사용한다.

//추상메소드 1개이상 포함되면 class왼쪽에 abstract표시
public abstract class AbstractTest {
    public int plus(int a, int b){
        return a+b;
    }
    //추상메소드: 반환형 왼쪽에 abstract
    //미완성메소드
    public abstract int minus(int a, int b);
    public abstract int divide(int a, int b);
    public int multiple(int a, int b){
        return a*b;
    }
}
