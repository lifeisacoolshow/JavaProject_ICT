package j01_basic;

public class J09Operator {
    public static void main(String[] args) {
        //비트연산자 : &, |, ^, ~, <<, >>, >>>
        int a = 10;
        // int b = a & 2; 2-> 이진법으로 계산
        int b = a ^ 2; //8
        System.out.println("b= " + b);

        int c = a << 2; // 2의 2승을 곱한 것과 같음
        System.out.println("c= " + c);

        int d = a >>> 2; // 2의 2승으로 나눈값과 같음
        System.out.println("d= " + d);


    }
}
