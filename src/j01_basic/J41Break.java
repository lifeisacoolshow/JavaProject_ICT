package j01_basic;

public class J41Break {
    public static void main(String[] args) {

        for(int i=1;;i++){
            System.out.println("i="+i);
            /*if(i>10)
                break;*/
            for(int j =1; j<=10; j++){
                System.out.println("j="+j);
                if(j<=2)
                    break;
            }
        }
    }
}
