package j04Inheritance;

public class ZZZ {
    public static void main(String[] args) {
        XXX x1 = new XXX();
        System.out.println(x1.getUserid());
        System.out.println(x1.getUsername());

        //클래스를 객체 생성하여 interface로 대입하기
        InterfaceZ interZ = new XXX();
        System.out.println(interZ.getUsername());

        XXX x2 = (XXX)interZ;
        System.out.println(x2.getUsername());
        System.out.println(x2.getUserid());
    }
}
