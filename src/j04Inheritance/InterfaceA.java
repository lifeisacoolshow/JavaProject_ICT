package j04Inheritance;
// interface에서 interface를 상속받을 경우 extends 이용하여 한개의 interface만 상속이 가능하다.
public interface InterfaceA extends InterfaceC{
    //static final 상수
    public static final int MAX = 1000;
    public static final String EDUCATION = "ICT";

    //추상메소드
    public int sum(int a, int b, int c);
    public int avg(int sum);
}
