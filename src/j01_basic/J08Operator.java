package j01_basic;

public class J08Operator {
    public static void main(String[] args) {
        //관계연산자(>,<,>=,<=,==,!=)
        //점수가 60점 이상이면 true, 60점 미만이면 false
        int score = 85;
        boolean result = score >= 60;
        System.out.println("result= " + result);

        boolean result2 = score >= 80 && score <= 100;
        System.out.println("result2= "+ result2);
    }
}
