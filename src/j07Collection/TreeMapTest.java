package j07Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public TreeMapTest() {
        //TreeMap: 키와 값이 존재하고, 키를 정렬한다.
        TreeMap<String, MemberVO> hm = new TreeMap<String, MemberVO>();
        //Map에 데이터저장
        hm.put("영현", new MemberVO(1111, "김영현", "010-3976-3901"));
        hm.put("니카", new MemberVO(2222, "아니카", "010-3416-9341"));
        hm.put("돌체", new MemberVO(3333, "황돌체", "010-6216-6421"));
        hm.put("수영", new MemberVO(4444, "황수영", "010-1976-5411"));
        hm.put("가연", new MemberVO(5555, "김가연", "010-3176-4311"));

        Set <String> keyList = hm.keySet();
        Iterator<String> ii = keyList.iterator();
        while (ii.hasNext()){
            String k = ii.next();//key
            MemberVO vo = hm.get(k);//value

            System.out.println(k+"-->"+vo.toString());
        }
    }

    public static void main(String[] args) {
        new TreeMapTest();
    }
}
