package j07Collection;

// Value Object
// member 변수를 캡슐화
public class MemberVO {
    private int num;
    private String name;
    private String tel;

    public MemberVO(){}
    public MemberVO(int num, String name, String tel){
        this.num = num;
        this.name = name;
        this.tel = tel;
    }
    //toString()메소드를 오버라이딩


    @Override
    public String toString() {
        return
                "num=" + num +
                ", name=" + name +
                ", tel=" + tel ;
    }

    //getter, setter 메소드 생성
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
