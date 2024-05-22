package j01_basic;

public class J40DoWhileEx {
    public static void main(String[] args) {
       int row =1;
       do{
           int col = 1;
           do{
               System.out.print(" *");
               col++;
           }while (col<=row);
           row++;
           System.out.println();
       }while(row<=5);
    }
}
