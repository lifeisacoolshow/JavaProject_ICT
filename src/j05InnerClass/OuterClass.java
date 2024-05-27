package j05InnerClass;

public class OuterClass {
    int num = 100;
    String name = "홍길동";
    String addr = "서울 성동구 성수동";
    public OuterClass (){
        //외부클래스내에서 내부클래스 객체는 외부클래스를 통하지 않아도 된다.
        InnerClass ii = new InnerClass();
        System.out.println(ii.tel);
    }
    public void memberPrint(){
        System.out.println("번호:"+num+", 이름:"+name);
        //output(); //내부클래스메소드 호출불가
    }

    //멤버영역에 정의하는 내부클래스
    class InnerClass{
        int num = 250;
        String name = "세종대왕";
        String tel = "010-1234-5678";
        InnerClass(){}
        public void output(){
            //외부 클래스의 멤버변수는 내부클래스에서 사용가능
            System.out.println(num+", "+name+", "+tel+", "+addr);
            //내부클래스에서 외부클래스의 메소드를 호출할 수 있다.
            memberPrint();
        }
    }

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.memberPrint();

        //멤버영역의 내부클래스를 객체로 만들기
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.output();
    }
}
