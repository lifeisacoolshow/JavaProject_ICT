package j01_basic;

public class J35ForEX {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            //공백
            for(int space=1;space<=5-i;space++){
                System.out.print(" ");
            }
            //*
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
