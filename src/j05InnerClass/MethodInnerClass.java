package j05InnerClass;

public class MethodInnerClass {
    String email = "neoneon0518@naver.com";
    public MethodInnerClass(){}
    public void output(){
        System.out.println("email->"+email);
    }
    public void createInner(){
        //메소드내의 내부클래스 생성: 메소드 호출 시 사용가능
        class InnerTest{
            int num = 4567;
            String username = "이순신";
            InnerTest(){
                System.out.println("메소드내의 내부클래스 객체 생성됨.");
            }
            void getInformation(){
                System.out.println("번호:" + num);
                System.out.println("이름:" + username);
                System.out.println("이메일:" + email);//외부의 멤버변수
                output();
            }
        }
        //내부클래스 객체 생성
        InnerTest it = new InnerTest();
        it.getInformation();
    }
    //////////
    public static void main(String[] args) {
        MethodInnerClass mic = new MethodInnerClass();
        mic.createInner();
    }
}
