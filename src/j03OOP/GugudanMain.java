package j03OOP;

public class GugudanMain {
    public GugudanMain(){
        Gugudan gg = new Gugudan();
        //전체구구단
        //gg.gugudanAll();
        gg.gugudan(gg.inData());
    }
    public static void main(String[] args) {
        new GugudanMain();
    }
}
