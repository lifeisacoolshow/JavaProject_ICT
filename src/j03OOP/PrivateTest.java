package j03OOP;

public class PrivateTest {
    int productNum = 1234;
    //변수에 private이 있으면 객체를 통한 접근이 불가능하다.
    //현재 클래스 내에서만 접근이 허용된다.
    private String productName = "컴퓨터";
    //생성자메소드에 private접근제한자는 객체를 생성할 수 없음
    //privatr PrivateTest(){

    // }
    public PrivateTest(){}

    //getter
    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) {
            this.productName = productName;
        }
    }


