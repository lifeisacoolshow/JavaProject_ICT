package j01_basic;

//메뉴를 입력받아 메뉴가 1이면 사각형의 넓이, 2이면 원의 넓이를 구하는 프로그램

import java.util.Scanner;

public class J17IfEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //1. 메뉴를 입력받기
        System.out.println("원하는 메뉴 선택\n(1.사각형의 넓이, 2.원의 넓이)");
        //int menu = Integer.parseInt(scan.nextLine()); -->mine
        int menu = scan.nextInt();

        //2. if문으로 넓이 구하기

       /*if (menu == 1) {
           System.out.println("가로=");
           int width = Integer.parseInt(scan.nextLine());
           System.out.println("세로=");
           int hight = Integer.parseInt(scan.nextLine());
           System.out.println("사각형의 넓이는= "+ width*hight);
            } else  {  if (menu == 2) {
           System.out.println("반지름=");
           int radius = Integer.parseInt(scan.nextLine());
           System.out.println("원의 넓이는="+ radius*radius);
                }
            }*/ //---> my answer1


        /*if (menu == 1) {
            System.out.println("가로=");
            int width = Integer.parseInt(scan.nextLine());
            System.out.println("세로=");
            int hight = Integer.parseInt(scan.nextLine());
            int area = width * hight;
            System.out.println("사각형의 넓이는= " + area);
        }

        if (menu == 2) {
            System.out.println("반지름=");
            double radius = Integer.parseInt(scan.nextLine());
            double area2 = radius * radius;
            System.out.println("원의 넓이는=" + area2 * 3.14);
        } //---> my answer2 (success)*/

        /*if (menu == 1) {
            System.out.println("가로=");
            int width = scan.nextInt();
            System.out.println("세로=");
            int hight = scan.nextInt();
            int area = width * hight;
            System.out.println("사각형의 넓이는= " + area);
        }
        if (menu == 2) {
            System.out.println("반지름=");
            double radius = scan.nextDouble();
            //double area2 = radius * radius * 3.14;
            double area2 = radius * radius * Math.PI;
            System.out.println("원의 넓이는= " + area2);
        } //---> T's answer*/

        if (menu == 1) {
            System.out.println("가로=");
            int width = scan.nextInt();
            System.out.println("세로=");
            int hight = scan.nextInt();
            int area = width * hight;
            System.out.println("사각형의 넓이는= " + area);
        }
        else {
            if (menu == 2)
                System.out.println("반지름=");
            double radius = scan.nextDouble();
            //double area2 = radius * radius * 3.14;
            double area2 = radius * radius * Math.PI;
            System.out.println("원의 넓이는= " + area2);
        } //---> T's answer2
    }
}