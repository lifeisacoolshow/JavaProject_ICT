package j04Inheritance;

import java.util.Calendar;

public class SingletonTestMain {
    public static void main(String[] args) {
        //생성자가 private이므로 객체 생성불가로 만들어져 있다.
        //new SingletonTest();

        SingletonTest t1 = SingletonTest.getInstance();
        SingletonTest t2 = SingletonTest.getInstance();
        System.out.println(t1);
        System.out.println(t2);

        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1);
        System.out.println(c2);
    }
}
