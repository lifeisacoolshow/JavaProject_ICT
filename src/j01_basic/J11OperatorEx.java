package j01_basic;

public class J11OperatorEx {
    public static void main(String[] args) {
        int data = 100;
        //data의 값이 짝수인지 홀수인지 구별하여 출력하라.

        String result = (data%2 == 0) ? "짝수" : "홀수";
        System.out.println(data + "은 " + result + "입니다.");

        String result2 = (data/2 == data/2.0)?"Even":"ODD";
        System.out.println(data + "은 " + result2 + "입니다.");
    }

}
/*
80은 짝수입니다.
89는 홀수입니다.
 */

