package j04Inheritance;

//interface는 추상메소드와 static final 상수를 기술한다.
//1.class에서 interface상속
//2.interface에서 interface상속
//3.상속받은 모든 interface의 추상메소드를 오버라이딩
public class InterfaceA_Main implements InterfaceA, InterfaceB{
    public InterfaceA_Main(){
        int total = sum(20, 50, 70);
        System.out.println("sum->"+total);
        System.out.println("avg->"+avg(total));
        System.out.println("grade->"+grade());
        System.out.println("pass->"+pass());
    }
    public int sum(int x, int y, int z){
        return x+y+z;
    }
    public int avg(int total){
        return total/3;
    }
    public String grade() {
        return "A";
    }
    public boolean pass(){
        return true;
    }
    public static void main(String[] args) {
        new InterfaceA_Main();
    }
}
