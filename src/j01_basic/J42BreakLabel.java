package j01_basic;

public class J42BreakLabel {
    public static void main(String[] args) {
        point:
        for(int i=1; i<=10; i++){
            for(int j=1; j <=10; j++){
                System.out.printf("i=%d, j=%d\n", i, j);
                if(j==5) break point;
            }
            System.out.println("----------------");
        }
    }
}
