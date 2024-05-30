package JavaTestProject;

import java.util.Calendar;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("년도=");
        int y = scan.nextInt();
        System.out.print("월=");
        int m = scan.nextInt();

        System.out.println("\t\t"+y+"년 "+m+"월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        Calendar date = Calendar.getInstance();
        date.set(y, m-1, 1);
        int week = date.get(Calendar.DAY_OF_WEEK);
        for(int s=1; s<week; s++){
            System.out.print("-\t");
        }
        int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
        for(int d=1; d<=lastDay;d++){
            System.out.print(d+"\t");
            if((week-1+d) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}