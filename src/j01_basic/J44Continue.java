package j01_basic;

public class J44Continue {
    public static void main(String[] args) {
        //continue : 반복문에서 사용하여 한번 건너뛰기의 기능을 가진다.
        for(int i=1;i<=10;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
