package j00_api;

public class MathTest {
    public static void main(String[] args) {
        // Math: java.lang package에 있음
        // 메소드 객체생성하지않고 클래스명,메소드명으로 호출
        int n = -12;
        double result = Math.abs(-12.568);
        System.out.println("abs->" + Math.abs(n));//절대치 구하기
        System.out.println("abs->" + result);
        System.out.println("ceil->" + Math.ceil(56.1));//올림
        System.out.println("ceil->" + Math.ceil(-25.9));//올림
        System.out.println("floor->" + Math.floor(-25.9));//버림
        System.out.println("floor->" + Math.floor(56.1));//버림
        int a = (int) Math.round(28.235);
        System.out.println("round->" + a);//반올림
        System.out.println("max->" + Math.max(56, 12));//둘중에 큰값(min 작은값)
        System.out.println("pow->" + Math.pow(5, 6));//거듭제곱
        System.out.println("sqrt->" + Math.sqrt(10));//루트
        System.out.println("-----난수-----");
        for (int i = 1; i <= 100; i++) {
            double ran = Math.random();
            /*
            *10  -> 0~9
            *100 -> 0~99
            *5   -> 0~4
            *??    -> 15~30 (int)(난수*(큰값-작은값+1))+작은값
            */
            int ranInt =(int)(Math.random()*(30-15+1))+15;
            System.out.println(ran + "\t"+(int)(ranInt));//난수: 컴퓨터가 임의의 값을 만들어주는 것을 말한다.
        }
        System.out.println();
    }
}
