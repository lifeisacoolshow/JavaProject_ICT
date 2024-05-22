package j02Array;

import java.util.Arrays;

public class ArrayCopyArrays {
    public static void main(String[] args) {
        int orgArr[] = {10,20,30,40,50};
        int tarArr[] = new int[10];

        //              원본배열, 시작위치, 타켓배열, 시작위치, 갯수
        System.arraycopy(orgArr,1,tarArr,3,3);

        //향상된 반복문 : 배열, 컬렉션
        //for(배열의 데이터형 변수선언: 배열 or 컬렉션)
        for(int data:tarArr){
            System.out.println(data);
        }
        //                                  원본, 시작위치, 끝위치(이전까지)
        int tarArr2[] = Arrays.copyOfRange(orgArr,1,4);
        // [20,30,40]
        System.out.println(Arrays.toString(tarArr2));
    }
}
