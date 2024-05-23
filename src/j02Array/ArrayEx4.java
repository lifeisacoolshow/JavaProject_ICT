package j02Array;

import java.util.Random;

public class ArrayEx4 {
    public static void main(String[] args) {
        Random random = new Random();
        //1~100사이의 난수를 1000개를 생성하여 배열에 보관
        int data[] = new int[1000];
        for(int i =0; i< data.length; i++){
            data[i] = random.nextInt(100-1+1)+1;
        }

        //갯수 구하기
        int cnt[] = new int[101]; //0~100 index가 있도록 0번 index는 사용하지 않는다.
        for(int i =0; i< data.length; i++){//0,1,2,3,4,..999
            cnt[data[i]]++;
        }
        for(int i=1; i< cnt.length; i++){
            System.out.print(i+"= "+cnt[i]+"\t");
            if(i%8==0){
                System.out.println();
            }
        }

        //최빈수 구하기
        int maxCnt = cnt[1];//카운트 한 갯수
        int maxIdx = 1;//가장 큰값을 가진 index를 보관할 변수
        for(int i=1; i< cnt.length; i++){//1,2,3,,,,,100
            if(cnt[i]>=maxCnt){//1
                maxIdx = i;
                maxCnt = cnt[i];
            }
        }
        System.out.println();
        System.out.println("결과: "+maxIdx+"=>"+maxCnt);
    }
}
