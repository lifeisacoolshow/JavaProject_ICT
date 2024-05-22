package j00_api;

import java.util.Scanner;

public class ForExDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("홀수를 입력하세요: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("홀수를 입력해야 합니다.");
            return;
        }

        char currentChar = 'A';
        int spaces = n / 2;
        int chars = 1;

        // 위쪽 삼각형 출력
        for (int i = 0; i < (n + 1) / 2; i++) {
            // 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 알파벳 출력
            for (int j = 0; j < chars; j++) {
                System.out.print(currentChar);
                if (j < chars / 2) {
                    currentChar++;
                } else {
                    currentChar--;
                }
            }

            System.out.println();
            spaces--;
            chars += 2;
            currentChar = 'A';
        }

        spaces = 1;
        chars = n - 2;

        // 아래쪽 삼각형 출력
        for (int i = 0; i < n / 2; i++) {
            // 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 알파벳 출력
            for (int j = 0; j < chars; j++) {
                System.out.print(currentChar);
                if (j < chars / 2) {
                    currentChar++;
                } else {
                    currentChar--;
                }
            }

            System.out.println();
            spaces++;
            chars -= 2;
            currentChar = 'A';
        }

    }
}
