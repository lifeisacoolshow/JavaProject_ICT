package j01_basic;

import java.util.Scanner;

public class StandardWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //데이터준비
        System.out.println("나이=");
        int age = scan.nextInt();
        System.out.println("성별(1:남, 2:여)");
        int gender = scan.nextInt();
        System.out.println("키=");
        double height = scan.nextDouble();
        System.out.println("현재체중=");
        double weight = scan.nextDouble();

        //표준체중
        double p = 0.90;
        if(age<=35 && gender == 2){//35세이하 여성은 0.85
            p = 0.85;
        } else if (age>=36 && gender == 1) {
            p = 0.95;
        }
        double standardWeight= (height - 100)*p;

        //표준체중지수
        double index =weight / standardWeight * 100;

        //표준체중지수 평가기준
        String standardStr = "";
        if(index<=85) standardStr = "마른형";
        else if (index<=95) standardStr = "조금마른형";
        else if (index<=115) standardStr = "표준형";
        else if (index<=126) standardStr = "조금비만형";
        else standardStr = "비만형";
        System.out.printf("당신의 표준체중지수는 %.2f으로 %s입니다.",index,standardStr);
    }
}
