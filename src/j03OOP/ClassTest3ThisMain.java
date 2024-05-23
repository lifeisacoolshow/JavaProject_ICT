package j03OOP;

public class ClassTest3ThisMain {
    public static void main(String[] args) {
        ClassTest3This ct1 = new ClassTest3This();
        ct1.print();

        ClassTest3This ct2 = new ClassTest3This("홍길동");
        ct2.print();

        ClassTest3This ct3 = new ClassTest3This(23, "세종대왕");
        ct3.print();

        //PrintStream클래스의 오버라이딩된 println()메소드 사용하기
        System.out.println(34);
        System.out.println("학번->"+2018005027);
        char[] txt = {'A', 'P', 'P', 'L','E'};
        System.out.println(txt);
        String str = String.valueOf(txt, 1, 3);
        System.out.println("str->"+str);

        byte[] c = {65,72,68,69};
        String str2 = new String(c);
        System.out.println("str2->"+str2);

        ct3.print(11);
        int k = ct3.print(5,10);
        System.out.println(k);
        ct3.num = 56;
    }
}
