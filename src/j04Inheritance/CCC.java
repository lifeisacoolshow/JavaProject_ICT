package j04Inheritance;

public class CCC extends BBB{
    public CCC(){
        BBB b1 = new BBB();
        System.out.println("b1.name->"+b1.name);//세종대왕
        System.out.println("b1.num->"+b1.num);//120

        //하위클래스 객체를 상위클래스 객체에 대입가능
        AAA a1 = b1;
        System.out.println("b1.name->"+a1.name);
        System.out.println("b1.num->"+a1.num);

        //상위클래스 객체를 하위클래스객체 대입가능(단, 강제형변환)
        BBB b2 = (BBB)a1;
        System.out.println("b1.name->"+b1.name);
        System.out.println("b1.num->"+b1.num);

        Object obj = b2;
        BBB b3 = (BBB)obj;
        System.out.println("b1.name->"+b3.name);
        System.out.println("b1.num->"+b3.num);
        System.out.println("-------------------");

        BBB bb1 = new BBB();
        bb1.setNum();
        System.out.println("bb1.num->"+bb1.num);

        //하위클래스의 오버라이딩된 메소드는 상위클래스로 형변환 하더라도 오버라이딩이 적용된다.
        AAA aa1 = new BBB();
        aa1.setNum();
        System.out.println("aa1.num"+aa1.num);
        System.out.println("aa1.getName()="+aa1.getName());
        //aa1.print();

        BBB bb3 = (BBB) aa1;
        bb3.print();
    }

    public static void main(String[] args) {
        new CCC();
    }
}
