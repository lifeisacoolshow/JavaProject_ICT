package j04Inheritance;

public class BBB extends AAA{
    String name = "세종대왕";
    public BBB(){
    }
    public void setNum() {
        num += 1000;
    }
    public void print(){//상위에 없는 메소드
        System.out.println("num->"+num);
    }
    public static void main(String[] args) {

    }
}
