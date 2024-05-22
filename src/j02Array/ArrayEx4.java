package j02Array;

import java.util.Random;

public class ArrayEx4 {
    public static void main(String[] args) {
        //난수생성
        Random ran = new Random();
        //배열선언
        int size =1000;
        int[] arr = new int[size];
        //배열에 난수지정
        for(int i=0; i<1000; i++){
            arr[i]= ran.nextInt(100)+1;
        }
    }
}
