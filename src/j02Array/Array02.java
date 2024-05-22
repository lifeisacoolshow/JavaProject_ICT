package j02Array;

public class Array02 {
    public static void main(String[] args) {
        //초기값이 있는 배열 선언하는 방법
        //     index  0, 1,2,3,4
        int num[] = {25,15,6,9,42};
        //              index  0,1,2,3,4
        int data[] = new int[]{7,5,7,9,3};

        String names[] = {"홍길동","세종대왕","강감찬","을지문덕","광개토대왕"};

        for(int i=0; i< names.length; i++){
            System.out.println(num[i]+"\t"+data[i]+"\t"+names[i]);
        }

        //배열 num의 총합
        int sum = 0;
        for(int j=0; j< num.length; j++){
            sum+=num[j];
        }
        System.out.println("int num[]의 합:"+sum);
    }
}
