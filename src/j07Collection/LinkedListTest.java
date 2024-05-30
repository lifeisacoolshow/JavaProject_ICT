package j07Collection;

import java.util.LinkedList;

public class LinkedListTest {
    public LinkedListTest(){
        start();
    }
    public void start(){
        //LinkedList는 List, Queue, Deque 인터페이스 상속
        //List: 저장순서유지
        //Queue: 한쪽에서 입력하고 다른데서 출력할 수 있다
        //Deque: 양쪽에서 입력과 출력하는 기능 제공한다

        LinkedList<String> ll = new LinkedList<String>();
        //객체 추가하기
        ll.offer("홍길동");
        ll.offer(new String("세종대왕"));
        ll.offer("이순신");
        ll.offer("김영현");
        ll.add(2 , "정예빈");

        System.out.println(ll.size());
        System.out.println(ll.pop());//제일 앞에 있는 객체를 얻어오기 컬렉션에서는 지워진다.
        System.out.println(ll.size());

        while(!ll.isEmpty()){//객체가 남아 있을 때
            System.out.println(ll.pop());

        }
    }

    public static void main(String[] args) {
        new LinkedListTest();
    }
}
