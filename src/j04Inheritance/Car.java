package j04Inheritance;
//클래스에 final은 상속하지 않는다.
//public final class Car {
public class Car{
    String color;
    int speed;
    //private 멤버변수는 상속하지 않는다.
    private int wheel = 4;
    //상위클라스의 매개변수없는 생성자는 반드시 기술한다.
    final int MAX_SPEED = 200;
    public Car (){
    //private Car(){
        System.out.println("Car()생성자메소드");
    }
    public Car(String color){
        this.color = color;
        System.out.println("Car(String)생성자메소드");
    }
    public void speedUp(){
        speed +=2;
        if(speed>100) speed =100;
        System.out.println("speed->" + speed);

    }
    private void stop(){
        speed = 0;
        System.out.println("speed-->"+speed);
    }
    public final void setColor(String color){
        this.color = color;
    }
}
