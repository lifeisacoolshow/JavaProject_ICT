package j02Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubblesortString {
    public static void main(String[] args) {
        Random ran = new Random();

        String data[]={"홍길동","세종대왕","이순신","강감찬","을지문덕","김삿갓"};

        System.out.println("=====정렬전=====");
        System.out.println(Arrays.toString(data));
        for(int j=0; j< data.length-1; j++) {
            for (int i = 0; i < data.length - 2-j; i++) {
                if (data[i].compareTo(data[i+1])>0){//i번째값과 i+1번째값을 비교하여 i번쩨 값이 크면 교환한다.
                    String temp = data[i];//i번째 값을 임시보관
                    data[i] = data[i + 1];
                    data[i + 1] = temp;//temp의 값 i+1번째에 대입
                }
            }
        }
        System.out.println("====1회 정렬후====");
        System.out.println(Arrays.toString(data));
    }
}
