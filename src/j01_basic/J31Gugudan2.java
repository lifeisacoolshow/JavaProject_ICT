package j01_basic;

public class J31Gugudan2 {
    public static void main(String[] args) {

        for(int i=2;i<=9;i++){//단
            System.out.println("=="+i+"단==");
            for(int j=2;j<=9;j++){
                System.out.printf("%d*%d=%2d\n",i,j,i*j);
            }
            System.out.println();
        }
    }
}
