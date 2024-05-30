package j07Collection;

import java.util.*;

public class HashMapEx {
    public HashMapEx() {
        HashMap<String, MemberVO> hm = new HashMap<String, MemberVO>();
        //Map에 데이터저장
        hm.put("영현", new MemberVO(1111, "김영현", "010-3976-3901"));
        hm.put("니카", new MemberVO(2222, "아니카", "010-3416-9341"));
        hm.put("돌체", new MemberVO(3333, "황돌체", "010-6216-6421"));
        hm.put("수영", new MemberVO(4444, "황수영", "010-1976-5411"));
        hm.put("가연", new MemberVO(5555, "김가연", "010-3176-4311"));

        //---회원을 이름순으로 정렬하여 목록을 출력
        //Collections.sort()는 데이터를 List로 전달해야한다.
        List<MemberVO> list = new ArrayList<MemberVO>();
        Collection<MemberVO> member = hm.values();
        Iterator<MemberVO> ii = member.iterator();
        while(ii.hasNext()){
            list.add(ii.next());
        }
        Collections.sort(list, new ObjectCompareMain().new CompareNumAsc());
        for(MemberVO vo:list){
            System.out.println(vo.toString());
        }
    }
    public static void main(String[] args) {
        new HashMapEx();
    }
}
