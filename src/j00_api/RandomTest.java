package j00_api;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //난수 전용클래스
        Random random = new Random();

        for(int i=1; i<=100; i++){
            //논리형난수 만들기  true, false
            //boolean ran = random.nextBoolean();
            //0보다 크고 1보다 작은 난수 생성
            //double ran = random.nextDouble(10.0);//난수*10.0
            // -2^31~2^31-1
            int ran = random.nextInt(20-10+1)+10; //10~20 사이의 값
            System.out.print(ran+"\t");
            if(i%5==0) System.out.println();
        }
    }
}
