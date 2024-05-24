package j04Inheritance;

public class Car {
    String color;
    int speed;
    //상위클랴스의 매개변수없는 생성자는 반드시 기술한다.
    public Car (){
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
}
