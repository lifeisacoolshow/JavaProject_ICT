package j03OOP;

import j03OOP.test.Member;

public class ProtectedTestMain extends Member{

    public ProtectedTestMain(){}

    public static void main(String[] args) {
        ProtectedTest pt = new ProtectedTest();
        System.out.println("pt.num=>"+pt.num);

        //Member mem = new Member();
        ProtectedTestMain ptm = new ProtectedTestMain();
        System.out.println(ptm.userid);
        ptm.output();
    }
}
