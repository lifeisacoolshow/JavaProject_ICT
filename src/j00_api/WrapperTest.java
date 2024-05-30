package j00_api;

public class WrapperTest {
    public static void main(String[] args) {
        //wrapper는 기본데이터형을 객체로 생성할  수 있는 클래스
        int a = 1234;
        //int -> Integer
        Integer i1 = Integer.valueOf(a);//new Integer(a);
        Integer i2 = Integer.valueOf("5678");//new Integer("568");
        System.out.println(i1);
        System.out.println(i2);

        //Integer -> int
        int b = i1.intValue(); // intValue()=1234, doubleValue() = 1234.0

        //jdk 1.5부터 적용된다.
        Integer ii= 8989; // 오토박싱
        int c = ii; //오토언박싱

        Object obj = 7788;


        String str = Double.toHexString(12.24);
        System.out.println(str);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
