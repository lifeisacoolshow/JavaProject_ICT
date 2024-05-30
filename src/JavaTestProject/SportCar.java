package JavaTestProject;

public class SportCar extends Car{
    public SportCar(){
    }
    protected void speedUp(){
        speed +=2;
        if(speed>maxSpeed){
            speed = maxSpeed;
        }
        System.out.println("현재속도"+speed);
    }
    protected void speedDown(){
        speed -= 1;
        if(speed < 0){
            speed = 0;
        }
        System.out.println("현재속도"+speed);
    }

    public static void main(String[] args) {
        SportCar s = new SportCar();
        System.out.println("색상은"+s.color);
        s.speedUp();
    }
}
