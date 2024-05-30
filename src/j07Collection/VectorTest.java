package j07Collection;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {
    public VectorTest(){}
    public Vector getData(){
        int age = 30;
        String productName = "세탁기";
        Calendar now = Calendar.getInstance();
        now.set(2025, 10, 5);
        Random random = new Random();
        MemberVO member = new MemberVO();
        member.setNum(1111);
        member.setName("홍길동");
        member.setTel("010-3976-3901");


        //List 인터페이스 상속
        //저장순서를 유지, index가 있음
        Vector v = new Vector();
        v.add(age);//in -> Integer -> object
        v.add(productName);
        v.add(now);
        v.add(random);
        v.add(1,member);

        return v;
    }
    //회원 100명의 정보를 Vector 리턴하기
    public Vector<MemberVO> getMember(){
        //Generic : 컬렉션에 담을 수 있는 객체를 통일시킨다.
        Vector<MemberVO> v = new Vector<MemberVO>();
        //Vector 컬렉션에 같은 타입의 객체를 여러개 저장할 때,
        v.add(new MemberVO(1,"홍길동1","010-3976-3901"));
        v.add(new MemberVO(2,"홍길동2","010-4976-3901"));
        v.add(new MemberVO(3,"홍길동3","010-5976-3901"));
        v.add(new MemberVO(4,"홍길동4","010-6976-3901"));
        v.add(new MemberVO(5,"홍길동5","010-7976-3901"));

        return v;
    }
}
