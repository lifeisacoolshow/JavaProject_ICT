package j07Collection;

import java.util.Calendar;
import java.util.Vector;

public class VectorTestMain {
    public VectorTestMain() {
        VectorTest vt = new VectorTest();
        Vector vector = vt.getData();
        int age = (Integer) vector.get(0);
        System.out.println("age= "+age);

        MemberVO vo = (MemberVO) vector.elementAt(1);
        //System.out.println(vo.getNum()+","+vo.getName()+","+vo.getTel());
        System.out.println(vo.toString());

        Calendar date = (Calendar)vector.get(3);
        System.out.println(date.get(Calendar.YEAR));

        //원하는 위치에 객체 바꾸기
        vector.set(3,"세종대왕");
        System.out.println(vector.get(3));

        vector.remove(2);
        vector.remove("세종대왕");
        System.out.println("객체수->"+vector.size());//객체의 수

        /////////
        Vector<MemberVO> member = vt.getMember();
        for(int i=0; i< member.size(); i++){
            MemberVO nVO = member.get(i);
            System.out.println(nVO.toString());
        }
    }


    public static void main(String[] args) {
        new VectorTestMain();
    }
}

