package j07Collection;

import java.util.*;

public class HashMapTest {
    public HashMapTest() {
        //Map 인터페이스를 상속받은 클래스는 key와 value를 가진다.
        //key는 중복될 수 없다.
        HashMap<String, MemberVO> hm = new HashMap<String, MemberVO>();
        //Map에 데이터저장
        hm.put("영현", new MemberVO(1111, "김영현", "010-3976-3901"));
        hm.put("니카", new MemberVO(2222, "아니카", "010-3416-9341"));
        hm.put("돌체", new MemberVO(3333, "황돌체", "010-6216-6421"));
        hm.put("수영", new MemberVO(4444, "황수영", "010-1976-5411"));
        hm.put("가연", new MemberVO(5555, "김가연", "010-3176-4311"));

        //key를 이용하여 값을 얻어옴
        MemberVO vo = hm.get("니카");
        System.out.println(vo.toString()+"\n");

        //모든 key 얻어오기
        Set<String> keyList = hm.keySet();
        Iterator<String> i = keyList.iterator();
        while (i.hasNext()){
            String k = i.next();
            MemberVO v = hm.get(k);
            System.out.println(v.toString());
        }
        System.out.println("===========values===========");
        //value만 얻어오기
        Collection<MemberVO> values = hm.values();
        Iterator<MemberVO> value=values.iterator();
        while(value.hasNext()){
            System.out.println(value.next().toString());
        }
    }

    public static void main(String[] args) {
        new HashMapTest();
    }
}
