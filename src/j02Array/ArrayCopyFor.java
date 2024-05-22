package j02Array;

public class ArrayCopyFor {
    public static void main(String[] args) {
        //for문을 이용한 배열의 복사
        int data1[] = {1,2,3,4,5};
        int data2[] = new int[10];
        for(int i=0; i<data1.length; i++){
            data2[i+2] = data1[i];
        }
        for(int j=0; j<data2.length; j++){
            System.out.println(data2[j]);
        }
    }
}
