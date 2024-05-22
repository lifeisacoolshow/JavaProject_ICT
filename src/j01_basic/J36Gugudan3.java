package j01_basic;

public class J36Gugudan3 {
    public static void main(String[] args) {
        System.out.println("\t   ==구구단==");

        for(int i = 1; i <= 9; i+=3){//i=1,4,7
            //구구단 제목
            for(int j = i; j < i+3;j++){//i=1->j=1,2,3 i=4->j=4,5,6 i=7->j=7,8,9
                System.out.print("=="+j+"단==\t");
            }
            System.out.println();
            //구구단 출력
            for(int j=2; j<=9; j++){
                //단 출력
                for(int dan=i; dan<i+3; dan++){
                    int result = dan * j;
                    System.out.print(dan + "*" + j + "=" + result + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
