package j02Array;

import java.util.Random;

public class Array01 {
    public static void main(String[] args) {
        Random ran = new Random();
        //배열 선언하기
        //같은 데이터형 변수 여러개 한번에 생성가능
        //크기가 정해지면 크기 수정불가

        //배열형변수명만 있고 메모리에서 공간을 확보하지 않은 상태이다.
        int[] arr;
        String[] name;

        //배열 생성
        arr = new int[10];//0
        name = new String[10];//null
        boolean[] boo = new boolean[10];//false

        //배열에 값 대입하기
        arr[2] = 90;

        //arr 배열에 난수 10개를 만들어 대입하라. (50~100)
        for(int i=0; i< arr.length; i++){
            arr[i] = ran.nextInt(100-50+1)+50;
        }

        //출력
        //배열명.length -> 배열의 길이 구하기: 개수
        for(int idx=0; idx<arr.length; idx++){//0,1,2,3,4
            System.out.println(arr[idx]+"\t"+name[idx]+"\t"+boo[idx]);
        }
    }
}
