package j04Inheritance;

public class Truck extends Car{
    String color = "흰색";
    public Truck(){
        //상위클래스의 다른 생성자를 호출한다.
        //반드시 첫번째 줄에 기술한다.
        super("빨강"); //Car(),Car(String color)
        System.out.println("Truck()생성자");
        //System.out.println("color="+color);
        //super.color -> 상위클래스의 멤버변수
        System.out.println("color="+super.color);
        //엑셀
        super.speedUp();
    }
    //override: 상위클래스의 메소드를 하위클래스에 재정의
    //메소드명과 매개변수(데이터타입)가 같아야 함
    //반환형은 달라도 되지만 원래의 반환형보다 작으면 안됨
    public void speedUp(){
        speed += 5;
        if(speed>120) speed = 120;
        System.out.println("speed====>"+speed);
    }
    //////////////////Nothing Here////////////////////
    public static void main(String[] args) {
        //모든 클래스는 Object 클래스를 상속받고있다. (컴파일러가 추가 해준다.)
        //상속관계에서 생성자는 상위클래스의 생성자 먼저 호출된다
        Truck t = new Truck();
        System.out.println("t.color->"+t.color);
        t.speedUp();
    }
}
