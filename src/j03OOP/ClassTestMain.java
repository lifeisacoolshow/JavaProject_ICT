package j03OOP;

import java.sql.SQLOutput;

public class ClassTestMain {

    public static void main(String[] args) {
        // new : 클래스로 객체를 만들어 사용한다.
        ClassTest ct =new ClassTest();

        ClassTest ct2 =new ClassTest();

        //객체내의 멤버변수 사용하기
        //객체명.멤버변수
        ct.a=1000; //=Math.PI
        System.out.println("ct.a->"+ct.a);
        System.out.println("ct2.a->"+ct2.a);

        System.out.println("------------------");
        ClassTest ct3 = new ClassTest(1234);
        System.out.println("ct3.a="+ct3.a+", ct3.n="+ct3.n);

        ClassTest2 ct4 = new ClassTest2();
        System.out.println("ct4.name->"+ct4.myName);

        //객체의 메소드 호출
        //객체명.메소드명
        ct3.sum();

        int result = ct2.sumResult(50);
        System.out.println("result="+result);
    }
}
