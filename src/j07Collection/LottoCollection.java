package j07Collection;
//복사본받기
import java.util.*;

public class LottoCollection {
    Scanner scam = new Scanner(System.in);
    Random random = new Random();

    public LottoCollection() {}
    //게임수를 입력받는 메소드
    public int input(String msg) {
        System.out.print(msg + "=");
        return scam.nextInt();
    }

    //1게임 만들기 - 난수생성, 중복검사
    public void createLotto() {
        //번호생성(보너스), 정렬
        TreeSet<Integer> lotto = new TreeSet<Integer>();
        int num = 0;
        while(lotto.size()<7){
            num = random.nextInt(45)+1;
            lotto.add(num);
        }
        //보너스번호
        lotto.remove(Integer.valueOf(num));
        lottoPrint(lotto.toArray(), num);
    }

    //로또 번호 출력하기
    public void lottoPrint(Object lotto[], int num){
        //번호
        System.out.print(Arrays.toString(lotto));
        //보너스
        System.out.println(", bonus="+num);
    }
    public void onGameCreate(int cnt){
       for(int i=1; i<cnt; i++){
           System.out.println(i+"게임=");
           //번호생성, 정렬, 출력
           createLotto();
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
        LottoCollection obj = new LottoCollection();
        obj.start();
    }
}
