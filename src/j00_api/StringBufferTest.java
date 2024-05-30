package j00_api;

import java.util.StringTokenizer;

public class StringBufferTest {
    public static void main(String[] args) {
        //String : 문자열의 연산이 적을때
        //StringBuffer : 멀티스레드지원, 문자열값이 바뀌어도 옮겨다니지 않는다.
        //StringBuilder : 멀티스레드지원안함, 문자열값이 바뀌어도 옮겨다니지 않는다.

        StringBuffer sb = new StringBuffer();
        System.out.println("확보한 공간->"+sb.capacity());

        StringBuffer sb2 = new StringBuffer(36);
        System.out.println("확보한 공간(sb.2)->"+sb2.capacity());

        String str = new String();
        str = str + "A";

        sb.append("JAVA");//마지막에 문자열추가
        sb.append("Programming");

        //중간에 문자열 추가
        sb.insert(4, "(자바)");

        //지우기
        sb.deleteCharAt(7);
        sb.delete(4,7);

        //Java ->avaJ
        sb.reverse();

        System.out.println("sb->"+sb.toString());
        System.out.println(sb.capacity());
        System.out.println("length->"+sb.length());

        StringTokenizer st = new StringTokenizer(",빨강, 노랑, 파랑/초록--주황",",");
        System.out.println("토큰수->"+st.countTokens());

        while (st.hasMoreElements()){//남은 토큰이 있는지 확인
            System.out.println(st.nextToken());
        }
    }
}
