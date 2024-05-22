package j00_api;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        //참조타입: 클래스(열거, 클래스, interface)로 생성된 데이터형을 말한다.

        String name1 = "홍길동";
        String name2 = "홍길동";

        if(name1 == name2){ //true
            System.out.println("name1과 name2가 같다."+name1.hashCode());
        } else{
            System.out.println("name1과 name2가 다르다.");
        }
        String username1 = new String("세종대왕");
        String username2 = new String("세종대왕");

        if(username1 == username2){ //true
            System.out.println("username1과 username2가 같다."+username1.hashCode());
        } else{
            System.out.println("username1과 username2가 다르다.");
            System.out.println(System.identityHashCode(username1));
            System.out.println(System.identityHashCode(username2));
        }
        //실제 데이터값으로 같은지 비교하여 true,false를 리턴한다.
        if(username1.equals(username2)){//객체는 == 로 비교불가. 주석끼리만 비교함
            System.out.println("username1과 username2가 같다.");
        }else {
            System.out.println("username1과 username2가 다르다.");
        }
        // 숫자<대문자<소문자<한글(유니코드)
        String n1 = "Java programing";//74
        String n2 = "java programing";//106

        int result=n1.compareTo(n2);//74-106
        System.out.println(result);//-32
        int result2=n1.compareToIgnoreCase(n2);//(!=compareToIgnoreCase)->대소문자 구별안함
        System.out.println(result2);

        String txt = "Java Programming Test";
        char r1=txt.charAt(5);//P->index위치의 문자얻어오기
        System.out.println(r1);

        txt = txt+"중";
        txt = txt.concat("입니다.");
        System.out.println("concat()->"+ txt);

        int idx = txt.indexOf("a");//-1
        System.out.println(idx);
        int idx2 = txt.indexOf("a");
        System.out.println(idx2);

        System.out.println(txt.length());
        String txt2 = txt.replaceAll("a","에이");//특정문자를 다른문자로 치환
        System.out.println("replaceAll()->"+txt2);

        //substring() : 문자열에서 일부 문자열을 얻어오기
        String t1=txt.substring(15); // index 15위치부터 끝까지 문자열을 구한다
        System.out.println("substring()->"+t1);
        String t2=txt.substring(3,10);
        System.out.println("substring(3,10)->"+t2);

        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        String str = "    데이터에 공백이 있으면 지운다.    ";
        //양쪽에 있는 공백문자 제거하기
        str = str.trim();
        System.out.println(str);
    }

}
