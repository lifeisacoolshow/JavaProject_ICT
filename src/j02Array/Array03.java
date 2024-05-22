package j02Array;

public class Array03 {
    public static void main(String[] args) {
        //2차원 배열 행과 열이 있는 배열
        int arr[][] = new int[4][3];

        //2행 1열에 값 대입
        arr[2][1] = 90;
        arr[0][2] = 85;

        for (int r = 0; r < arr.length; r++) {//행
            for (int c = 0; c < arr[r].length; c++) {//열
                System.out.print(arr[r][c] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("초기값이 있는 2차원 배열");
        int arr2[][] = {{10,60,70,61},{56,85,59,47},{45,75,95,96},{451,715,915,916}};

        //2차원 배열에서 행의 수는 배열명 .length
        //2차원 배열에서 열의 수는 배열명 [행index].length ->arr2[2].length
        for(int r=0; r< arr2.length; r++){//0~2
            for(int c=0; c<arr2[r].length; c++){//0~3
                System.out.print(arr2[r][c]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        int arr3[][] = {{90,96,64,95,48},{54,76,43,98,67},{59,92,46,68,26},{53,75,27,35,87}};
        for(int r=0; r<arr3.length; r++){
            for(int c=0; c<arr3[r].length; c++){
                System.out.print(arr3[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
