package j01_basic;

public class J15If {
    public static void main(String[] args) {
        // if문: 조건문
        // 조건식이 참일 때 블럭내의 실행
        // 조건식이 거짓일 때 블럭 건너뜀

        /*
            if(조건문) {
                실행문;
                실행문;
                :
            }
         */

        int data = 56;
        // data의 값이 50이상일때만 값을 출력하고, 50 미만일때는 아무실행도 하지않는다.
        if (data>=50) {
            System.out.println("data= "+data);
            int num = 2345;
            System.out.println("num= "+num);
        }
        System.out.println("if문 밖....");
        //num은 if문의 지역변수이므로 if문 밖에서 사용할 수 없는 변수이다.
        //System.out.println("if문 밖...."+ num);

        int data2 = -10;
        // data2가 음수면 양수로 만들어라. 양수이면 그냥 두면 된다.
        if (data2 < 0) {
            data2 = -data2;
        }
        System.out.println("data2= "+ data2);

    }
}
