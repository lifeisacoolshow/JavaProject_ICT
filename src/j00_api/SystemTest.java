package j00_api;

    import java.sql.SQLOutput;

    public class SystemTest {
        public static void main(String args[]) {
            System.out.println(1);
            //System.exit(0);
            // 프로그램을 종료시킨다. 0: 정상종료
            System.out.println(2);

            // 시간을 얻어올 수 있다. (밀리초) 1970-01-01 00:00:00
            System.out.println("currentTimeMillis=" + System.currentTimeMillis());

            System.out.println("----");

            // 콘솔에 문자열 형식으로 출력하는 메소드
            // 1. prinln() : 1줄단위로 출력
            // 2. print() : 출력 후 줄바꿈하지 않는다.
            // 3. printf() : 출력형식에 맞게 출력한다.

            // 제어문자 : \n ->줄바꿈, \", \', \t -> like tab key
            System.out.println("println()\"메소드\"를 이용한 출력문");

            System.out.println("----");

            System.out.print("자바에서");
            System.out.print("출력문");
            System.out.print("테스트");
            System.out.println("~~~~");

            System.out.println("----");

            int a = 100;
            System.out.println("국어점수="+ a);
            System.out.println("국어점수="+ (a + 5));
            System.out.println("국어점수="+ a + 5);
            System.out.println(a + 5);

            System.out.println("----");

            //System.out.printf("출력형식",a,b,c,...)
            System.out.printf("eng=%-8d, 체육=%-5d\n", a, 50);
            System.out.printf("eng=%8d, 체육=%5d\n", a, 50);

            System.out.println(10/3.0);
            System.out.printf("~%8.2f~\n", 10/3.0);

            System.out.printf("~%8s~\n", "김영현");
            System.out.printf("~%-8s~\n", "김영현");//콘솔에서 두칸차지
            System.out.printf("~%-8s~\n", "ABC");//콘솔에서 한칸차지 (숫자, 영어, 특수기호)

            System.out.printf("%x", 31);//16진수로

            System.out.println("----");
        }
    }
}
