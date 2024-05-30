package j07Collection;

import java.util.*;


public class ObjectCompareMain {
    public ObjectCompareMain() {
    }
    public void start(){
        //데이터준비
        List<MemberVO> list = new ArrayList<MemberVO>();
        list.add(new MemberVO(5000, "김영현,", "010 - 2431 - 5423"));
        list.add(new MemberVO(4000, "정예빈,", "010 - 1235 - 7532"));
        list.add(new MemberVO(3000, "김유림,", "010 - 9764 - 6422"));
        list.add(new MemberVO(2000, "황수영,", "010 - 4234 - 4521"));
        list.add(new MemberVO(1000, "이채영,", "010 - 5234 - 5678"));

        System.out.println("------정렬전------");
        for (MemberVO vo : list) {
            System.out.println(vo.toString());
        }
        //번호로 오름차순으로 정렬
        Collections.sort(list, new CompareNumAsc());
        System.out.println("====번호를 오름차순====");
        for (MemberVO vo : list) {
            System.out.println(vo.toString());
        }
        //번호호 내림차순으로 정렬
        Collections.sort(list, new CompareNumDesc());
        System.out.println("====번호를 내림차순====");
        for (MemberVO vo : list) {
            System.out.println(vo.toString());
        }
        //이름을 오름차순으로 정렬
        Collections.sort(list, new CompareNameAsc());
        System.out.println("====이름을 오름차순====");
        for (MemberVO vo : list) {
            System.out.println(vo.toString());
        }
        //이름을 내림차순으로 정렬
        Collections.sort(list, new CompareNameDesc());
        System.out.println("====이름을 내림차순====");
        for (MemberVO vo : list) {
            System.out.println(vo.toString());
        }
        //전화번호 오름차순 정렬
        Collections.sort(list, new CompareTelAsc());
        System.out.println("====전화번호를 오름차순====");
        for(MemberVO vo : list){
            System.out.println(vo.toString());
        }
        //전화번호 내림차순 정렬
        Collections.sort(list, new CompareTelDesc());
        System.out.println("====전화번호를 내림차순====");
        for(MemberVO vo : list){
            System.out.println(vo.toString());
        }
    }
    //정렬클래스는 Comparator 인터페이스를 상속받아 compare 메소드를 오버라이딩한다.
    //전화번호를 오름차순으로 정렬하는 클래스
    class CompareTelAsc implements Comparator<MemberVO> {
        public int compare(MemberVO v1, MemberVO v2) {
            return v1.getTel().compareTo(v2.getTel());
        }
    }
    //전화번호를 오름차순으로 정렬하는 클래스
    class CompareTelDesc implements Comparator<MemberVO> {
        public int compare(MemberVO v1, MemberVO v2) {
            return v2.getTel().compareTo(v1.getTel());
        }
    }
    //문자(이름)를 오름차순으로 정렬하는 클래스
    class CompareNameAsc implements Comparator<MemberVO> {
        public int compare(MemberVO v1, MemberVO v2) {
            //양수면 교환
            //"A".compareTo("B") -> -1
            return v1.getName().compareTo(v2.getName());
        }
    }
    //문자(이름)를 내림차순으로 정렬하는 클래스
    class CompareNameDesc implements Comparator<MemberVO> {
        public int compare(MemberVO v1, MemberVO v2) {
            return v2.getName().compareTo(v1.getName());
        }
    }

    //번호를 오름차순으로 정렬하는 클래스
    class CompareNumAsc implements Comparator<MemberVO> {
        public int compare(MemberVO v1, MemberVO v2) {
            //v1의 번호 - v2의 번호 뺀 후 양수 리턴받으면 교환
            return (v1.getNum() > v2.getNum()) ? 1 : (v1.getNum() < v2.getNum()) ? -1 : 0;
        }
    }
    //번호를 내림차순으로 정렬하는 클래스
    class CompareNumDesc implements Comparator<MemberVO> {
        public int compare(MemberVO v1, MemberVO v2) {
            //양수가 리턴되면 교환한다.
            return (v1.getNum() < v2.getNum()) ? 1 : (v1.getNum()) > v2.getNum() ? -1 : 0;
        }
    }
    public static void main (String[] args){
        new ObjectCompareMain().start();
    }
}
