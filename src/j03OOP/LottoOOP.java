package j03OOP;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoOOP {
    Scanner scam = new Scanner(System.in);
    Random random = new Random();

    public LottoOOP() {}
    //게임수를 입력받는 메소드
    public int input(String msg) {
        System.out.print(msg + "=");
        return scam.nextInt();
    }

    //1게임 만들기 - 난수생성, 중복검사
    public int[] createLotto() {
        int lotto[] = new int[7];
        for (int i = 0; i < lotto.length; i++) {//0,1,2,3,4,5,6
            lotto[i] = random.nextInt(45 - 1 + 1) + 1;
            //중복검사 i->방금 생성한 번호
            for (int j = 0; j < i; j++) {
                if (lotto[j] == lotto[i]) {//i=지금생성한번호, j=이전생성번호
                    i--;//현재 index를 1 감소시켜 같은 위치에 번호를 생성하여 보관한다.
                }
            }
        }
        return lotto;
    }

    //로또 번호 정렬하기 : 보너스제외하고 정렬
    public int[] lottoSort(int lotto[]) {
        for (int i = 0; i < lotto.length - 2; i++) {//0,1,2,3,4,5
            for (int j = 0; j < lotto.length - 2 - i; j++) {//0->0,4 1->0,3
                if (lotto[j] > lotto[j+1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                }
            }
        }
        return lotto;
    }

    //로또 번호 출력하기
    public void lottoPrint(int lotto[]){
        //번호
        System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)));
        //보너스
        System.out.println(", bonus="+lotto[6]);
    }
    public void onGameCreate(int cnt){
       for(int i=1; i<cnt; i++){
           //번호생성
           int lotto[] = createLotto();
           //정렬
           lotto = lottoSort(lotto);
           //출력
           lottoPrint(lotto);
       }
    }
    public void start(){
        do {
            int gameCount = input("게임수");
            onGameCreate(gameCount);
            int que = input("계속하시겠습니까(1.예, 그외: 아니요)");//계속여부
            if(que != 1){
                System.out.println("게임을 마치겠습니다.");
                break;
            }
        } while (true);
    }
    public static void main(String[] args) {
        LottoOOP obj = new LottoOOP();
        obj.start();
    }
}
