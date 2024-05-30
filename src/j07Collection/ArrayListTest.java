package j07Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public ArrayListTest(){
        //회원이 10명있다.
        List<MemberVO> mem = getInformation();
        //향상된 반복문
        for(MemberVO vo : mem){
            System.out.println(vo.toString());
        }
    }
    //ArrayList<MemberVO>
    public List<MemberVO> getInformation(){
        List<MemberVO> member = new ArrayList<MemberVO>();

        member.add(new MemberVO(1111, "김유림", "010-1111-1222"));
        member.add(new MemberVO(1112, "정예빈", "010-2111-2222"));
        member.add(new MemberVO(1113, "김유림3", "010-3111-3222"));
        member.add(new MemberVO(1114, "정예빈4", "010-4111-4222"));
        member.add(new MemberVO(1115, "먼지젤리", "010-5111-5222"));

        return member;
    }
    public static void main(String[] args) {
        new ArrayListTest();
    }
}
