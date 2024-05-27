package j01_basic;

public class J06Operator {
    public static void main(String[] args) {
        //산술연산자 (+,-,  <  *,/,%)
        int n1 = 14;
        int n2 = 3;

        //단항연산자 (+,-)
        int result1 = -n1;
        System.out.println("result1="+ result1);

        //단항연산자 (++,--) : 1증가 또는 1감소
        ++n1;//n1++; //결과값이 같음
        n2--;
        System.out.println("n1="+ n1);
        System.out.println("n2="+ n2);

        //n1 =15, n2 =2
        int result2 = n1++ + 2; // 16,17
        System.out.println("n1="+ n1+ ", result2="+ result2);
        int result3 = ++n1 + 2; // 17,19
        System.out.println("n1="+ n1+ ", result3="+ result3);

        //------------------
        int a = 10;
        a = a + 1; // a = a - 1;
        System.out.println("a=" + a); //11

        a = a + 1;
        a += 1; // a+=2; a+=3;
        System.out.println("a=" + a);

        a= a + 1 -7 / 3 + 3 * 2;
        System.out.println(a); // 18
        a += 1 + 4 * 2 / 3 - 7;
        // a = a + 1 + 4 * 2 / 3 - 7;
        System.out.println(a); // 14

        // ! : 부정연산자
        //boolean boo = true;
        boolean boo = 10>5;
        boolean result5 = !boo;
        System.out.println(result5); // false

        // ~ : 비트 부정연산자
        int x = 10;
        int result6 = ~x;
        System.out.println("result6="+ result6);

    }
}
