package j00_api;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //현재 시스템의 날짜(시간) 정보구하기
        Date now = new Date();
        System.out.println(now);

        Date date = new Date(2022,10,5);
        System.out.println(date);
    }
}
