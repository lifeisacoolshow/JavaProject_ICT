package j02Array;

import java.util.Random;

public class ArrayEx {
    public static void main(String[] args) {
        //배열에 1~1000 사이의 100개를 난수로 만들어 저장한 후
        //평균, 최대값, 최소값을 구하라.
        //실행

        //배열크기
        int size=100;
        //배열선언
        int[] arr = new int[size];
        //난수생성
        Random ran = new Random();
        //배열에 난수할당
        for(int i=0; i<size; i++){
            arr[i] = ran.nextInt(1000)+1;
        }
        //평균,최대,최소값
        int sum=0;
        int max=arr[0];
        int min=arr[0];

        for(int num : arr){
            sum += num;
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }

        double avgArr=(double) sum/size;

        System.out.println("평균:"+avgArr);
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
    }
}
