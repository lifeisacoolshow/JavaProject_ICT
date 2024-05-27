package j01_basic;

public class J05Variable {
    int num = 10;
    int a;

    public static void main(String[] args) {
        //main()메소드의 지역변수 : local변수
        int bun = 24;
        int b;

        //byte, short, int, long
        byte age = 12;
        System.out.printf("age=%d\n", age);

        //큰 데이터형을 작은 데이터형에 대입시 강제로 형변환한다.(명시적 형변환)
        byte height = (byte) 130;
        System.out.println("height=" + height);// 바이트의 저장되는 값의 범위 : -128~127

        //작은 데이터형을 큰 데이터형에 대입시 형변환이 자동으로 된다.(묵시적 형변환)
        double age2 = age;
        System.out.println(age + ", " + age2);

        int value = 20;
        int result = value + 10; //초기값이 없이 수식을 계산할 수 없음
        System.out.println("resul=" + result);

        boolean boo = true;
        boolean boo2 = 4<3;
        System.out.println(boo+", "+ boo2);

        // 1개의 문자열 보관하는 변수
        char name = 'Z';
        char name2 = '홍';
        String firstName = "길동"+"김";

        int result2 = name+2;
        char result3= (char)(name+2);

        System.out.println("firstName="+ firstName);
        System.out.println("result2="+ (char)result2 );
        System.out.println("result3="+ result3 );

    }

}
