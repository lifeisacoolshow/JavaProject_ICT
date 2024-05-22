package j00_api;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderEX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //년월입력
        System.out.println("년도=");
        int y = scan.nextInt();
        System.out.println("월=");
        int m = scan.nextInt();

        System.out.println("\t\t"+y+"년 "+m+"월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        //오늘 날짜의 Calender 객체 구하기
        Calendar date = Calendar.getInstance();
        //입력받은 년,월,1일로 Calender객체의 날짜를 변경
        date.set(y, m-1, 1);
        //1일에 대한 요일 구하기
        int week = date.get(Calendar.DAY_OF_WEEK);
        //1일을 출력하기 전에 공백을 출력, 요일의 값을 이용
        for(int s=1; s<week; s++){
            System.out.print("-\t");
        }
        //마지막날 구하기
        // 30->4,6,9,11
        // 31->1,3,5,7,8,10,12
        // 28,29->2
        int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//--->매소드 활용
        /*int lastDay = 31;
        switch(m){
            case 4:
            case 6:
            case 9:
            case 11: lastDay=30; break;
            case 2:
                lastDay=28;
                //윤년 고르기
                if(y%4==0 && y%100!=0 || y%400==0){
                    lastDay = 29;
                }
        }*///--->수작업
        //날짜출력
        for(int d=1; d<=lastDay;d++){
            System.out.print(d+"\t");
            if((week-1+d) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
