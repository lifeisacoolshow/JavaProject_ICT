package j00_api;

import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        //객체만들기
        //Calender클래스는 new를 이용하여 객체를 생성할 수 없다.
        //getInstance()메소드를 호출하면 Calender객체를 만들어 리턴해준다.
        Calendar date = Calendar.getInstance();
        //년월일 변경하기
        date.set(2025,1,5);
        date.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(date);
        //2025년 2월 5일 (오후) 12:54:12 수요일
        /*System.out.println(date);
        System.out.println(date.get(Calendar.DAY_OF_WEEK));*/
        //년도구하기
        int year = date.get(Calendar.YEAR);// (=date.get(1));
        int month = date.get(Calendar.MONTH)+1;// (=date.get(2));
        int day = date.get(Calendar.DAY_OF_MONTH);// (=date.get(5));
        int amPm = date.get(Calendar.AM_PM);//0:오전, 1:오후 (=date.get(9));
        String str = "";
        if(amPm==0){
            str = "오전";
        }else{
            str = "오후";
        }
        int hour = date.get(Calendar.HOUR_OF_DAY);// HOUR:12시간 기준, HOUR OF DAY:24시간 기준 (=date.get(10|11));
        int minute = date.get(Calendar.MINUTE);// (=date.get(12));
        int second = date.get(Calendar.SECOND);// (=date.get(13));
        int week = date.get(Calendar.DAY_OF_WEEK);// 1:일,,,7:토(=date.get(7));
        String weekName = "";
        switch (week){
            case 1: weekName = "일"; break;
            case 2: weekName = "월"; break;
            case 3: weekName = "화"; break;
            case 4: weekName = "수"; break;
            case 5: weekName = "목"; break;
            case 6: weekName = "금"; break;
            case 7: weekName = "토"; break;
        }
        System.out.println(year+"년"+month+"월"+day+"일 ("+str+") "+hour+":"+minute+":"+second+" "+weekName+"요일");
        // 2025/2/23 올해 몇일째인지
        int yearDay= date.get(Calendar.DAY_OF_YEAR);
        // 2025/2/23 올해 몇주차인지
        int yearWeek= date.get(Calendar.WEEK_OF_YEAR);
        System.out.printf("올해는 %d일째, %d주차", yearDay, yearWeek);

    }
}
