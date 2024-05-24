package j03OOP;
/*
접근제한자
public: 누구나, 클래스, 멤버변수, 생성자메소드, 메소드
*/

import java.util.Calendar;

public class PrivateTestMain {
    public static void main(String[] args) {
        //객체생성불가 생성자메소드를 private
        //PrivateTest pt = new PrivateTest();
        //Calendar now = new Calendar();

        PrivateTest pt = new PrivateTest();
        System.out.println("상품번호:"+pt.productNum);
        //System.out.println("상품명:"+pt.productName);
        System.out.println("상품명:"+pt.getProductName());
        //pt.productname = "PC";
        pt.setProductName("PC");
        System.out.println("상품명:"+pt.getProductName());
    }
}
