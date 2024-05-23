package j03OOP;

public class ClassTest3This {
    //final변수는 상수화된 변수
    //변수: 변수의 값을 수정할 수 없다.
    //클래스: 상속할 수 없음
    final int BAN = 12; // =Math.PI 대문자 변수는 변경 불가
    int num;
    String name;
    //생성자 오버로딩 : 같은 생성자가 여러개 존재할 때
    ClassTest3This(){
        this(5);
        System.out.println("ClassTest3This()");
    }
    ClassTest3This(int num){
        this.num = num;
    }
    ClassTest3This(String name){
        this.name = name;
    }
    ClassTest3This(int num, String name){
        //생성자 메소드 내에서 다른 생성자 메소드를 호춯하지 못한다.
        //ClassTest3This();
        //this()로 호출이 가능하다.
        //this(5)
        //this("최길동")
        //this(4, "김길동")
        //this("강길동", 8)
        //반드시 첫번째 실행문으로 표기하여야 한다.
        this(); //this.num = num;
        this.name = name;
    }
    ClassTest3This(String name, int num){
        this(name);//this.name = name;
        this.num = num;
    }
    //메소드 오버로딩
    //메소드명은 같고 매개변수 갯수, 데이터형이 달라야 한다.
    public void print(){
        System.out.printf("num->%d, name->%s\n",num,name);
    }
    public void print(int n){
        System.out.println("n->"+n);
    }
    public void print(String name){
        System.out.println("name->"+name);
    }
    public int print(int a, int b){
        System.out.println(a+","+b);
        return a+b;
    }

}
