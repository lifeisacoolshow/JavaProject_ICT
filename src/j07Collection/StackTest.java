package j07Collection;

import java.util.Stack;

public class StackTest {
    public StackTest() {
    }
    public void start(){
        //Stack : FILO의 기능을 가지며, 꺼내면 데이터가 지워짐.
        Stack<String> stack = new Stack();

        stack.push("황돌체");
        stack.push("아니카");
        stack.push("정예빈");
        stack.push("김유림");

        while(!stack.empty()){
            String pop = stack.pop();
            System.out.println(pop);
        }
    }

    public static void main(String[] args) {
        new StackTest().start();
    }
}
