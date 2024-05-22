package j02Array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int data[][] = new int[5][5];


        for(int r=0; r<data.length; r++){
            for(int c=0; c<data[r].length; c++){
                if(r ==c || r+c==data[r].length-1){
                    data[r][c]=1;
                }
            }
        }
        for(int rows[]:data){
            for(int d: rows){
                System.out.print(d+"\t");
            }
            System.out.println();
        }
    }
}
