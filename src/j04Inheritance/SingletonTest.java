package j04Inheritance;

public class SingletonTest {
    private static SingletonTest single = null;
    private String name = "Singleton Class1";

    //new 객체를 생성할 수 없는 클래스
    private SingletonTest(){}
    //객체를 생성하는 메소드를 별도로 생성
    //Calendar.getInstanace();
    public static SingletonTest getInstance(){
        if(single == null){
            single = new SingletonTest();
        }
        return single;
    }

}
