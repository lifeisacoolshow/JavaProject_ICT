package j01_basic;

import java.util.Scanner;

public class EmailCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            //이메일입력
            System.out.print("이메일입력=");
            String email = scan.nextLine();

            //이메일 유효한 메일인지 확인
            int atMark = email.indexOf("@");//@위치 구하기 없으면:-1, 있으면 index값
            int lastAtMark = email.lastIndexOf("@");//@를 뒤에서부터 검색하여 index를 찾는다.
            int point = email.indexOf(".");

            //점(.)의 갯수
            int cnt = 0;
            for (int idx = 0; idx < email.length(); idx++) {//idx=0,1,2,,,,length
                if (email.charAt(idx) == '.') cnt++;
            }

            if (atMark == -1 || atMark != lastAtMark || point == -1 || cnt > 2 || Math.abs(atMark-point)<3) {//유효하지 않은 경우
                System.out.println(email + "은 잘못된 이메일주소입니다.");
            } else {//유효한 경우
                //아이디
                String id = email.substring(0, atMark);
                //도메인
                String domain = email.substring(atMark + 1);
                //출력
                System.out.println("아이디=" + id);
                System.out.println("도메인=" + domain);
            }
        }
    }
}
