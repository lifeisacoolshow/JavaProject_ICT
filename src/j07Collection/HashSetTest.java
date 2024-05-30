package j07Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    int data[] = {15, 43, 53, 23, 23, 67, 35, 53, 53};
    public HashSetTest(){
        //HashSet: 저장순서를 유지하지 않는다. 중복데이터 허용하지 않는다.
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int d : data){
            hs.add(d);
        }
        ////////////////
        Iterator<Integer>ii = hs.iterator();
        while(ii.hasNext()){
            System.out.println(ii.next());
        }


    }

    public static void main(String[] args) {
        new HashSetTest();
    }
}
