package j01_basic;

public class J30For {
    public static void main(String[] args) {
        char alpha = 'A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                //System.out.println(i+","+j);
                //System.out.print(i+", "+j+"\t");
                //System.out.println("*");
                System.out.println(alpha++);
            }
            System.out.println();
        }
    }
}
