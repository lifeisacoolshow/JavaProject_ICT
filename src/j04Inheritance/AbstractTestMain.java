package j04Inheritance;

public class AbstractTestMain extends AbstractTest{

    public AbstractTestMain(){
        //추상메소드가 포함되어 있어서 객체를 생성할 수 없다.
        //AbstractTest at = new AbstractTest();
        System.out.println("plus->"+plus(10,20));
        System.out.println("minus->"+minus(20,50));
    }
    //추상클래스의 모든 추상메소드를 오버라이딩 한다.
    public int minus(int x, int y){
        return Math.abs(x-y);
    }
    public int divide(int x, int y){
        return 0;
    }
    public static void main(String[] args) {
        new AbstractTestMain();
    }
}
