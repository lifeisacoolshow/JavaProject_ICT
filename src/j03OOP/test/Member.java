package j03OOP.test;

public class Member {
    protected String userid = "hong";
    public Member(){
        System.out.println("Member생성자메소드");
    }
    protected void output(){
        System.out.println(userid+"님 안녕하세요.");
    }
}
