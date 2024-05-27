package j01_basic;

public class J10Operator {
    public static void main(String[] args) {
        int score = 75;
        //(조건식) ? 값, 연산식 ; 값, 연산식
        String result = (score > 90) ? "A" : "B" ; // (String)
        //int result2 = (score > 90) ? score*2 : score*3 ; -> 데이터타입에 맞게 변수값 지정 (int)
        //boolean result3 = (score > 90) ? true : false ; -> 데이터타입에 맞게 변수값 지정 (boolean)
        System.out.println("result= "+ result);

        //score가 80 이상이면 "A"
        //       60~80사이면 "B"
        //       60 미만이면 "C"

        char result4 = (score >= 80) ? 'A' : (score >= 60) ? 'B' : 'C';
        System.out.println("result4= "+ result4);

        int pay = 120;
        double result5 = (pay >= 100) ? pay*0.1 : pay*0.2;
        System.out.println("result5= "+ result5);
    }
}
