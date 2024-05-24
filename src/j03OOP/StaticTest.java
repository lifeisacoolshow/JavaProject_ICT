package j03OOP;

public class StaticTest {
    int a = 200;

    //필드에 static 사용하기
    static int b = 1000;

    static {
        for(int i=1; i<5; i++){
            System.out.println("i="+i);
        }
    }

    public StaticTest(){
        System.out.println("a="+a);
    }
    public void  setA(int a){
        this.a = a;
    }
    //static 메소드
    public static int getA(){
        //return a; //static 메소드에서 non-static 멤버변수는 접근할 수 없다.
        return 0;
    }
    public static int getB(){
        return b;
    }


    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st.a);
        st.setA(300);
        st.setA(400);
        System.out.println(st.a+","+ st2.a);
        st.b =2000;
        System.out.println(st.b+","+ st2.b);
        System.out.println(StaticTest.b);
        //Math.PI

        int aa = StaticTest.getA();
        int bb = StaticTest.getB();
        System.out.println("aa->"+aa+" bb->"+bb);
    }
}
