package j07Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    int data[] = {15, 43, 53, 23, 23, 67, 35, 53, 53};
    public TreeSetTest(){
        //TreeSet:저장순서유지하지않음
        //중복데이터허용안함
        //정렬

        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int d : data){
            ts.add(d);
        }
        System.out.println("--오름차순--");
        Iterator<Integer> ii = ts.iterator();
        while(ii.hasNext()){
            System.out.println(ii.next());
        }
        System.out.println("--내림차순--");
        Iterator<Integer> iii = ts.descendingIterator();//내림차순으로 정렬
        while(iii.hasNext()){
            System.out.println(iii.next());
        }
    }

    public static void main(String[] args) {
        new TreeSetTest();
    }
}
