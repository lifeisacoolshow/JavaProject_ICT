package j04Inheritance;

public class XXX extends YYY implements InterfaceZ {
    String userName;
    public XXX(){
        userName = "김영현";
    }
    //interface의 추상메소드 오버라이딩
    public String getUsername(){
        return "당신의 이름은 " + userName + "입니다.";
    }
}
