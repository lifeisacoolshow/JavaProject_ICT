package j02Array;

public class ArrayEx2 {
    public static void main(String[] args) {
        int data[][] = {{90, 54, 59, 53}, {96, 76, 92, 75}, {64, 43, 46, 27}, {95, 98, 68, 35}, {48, 67, 26, 87}};
        for (int c = 0; c < data[0].length; c++) {
            for (int r = 0; r < data.length; r++) {
                System.out.print(data[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
