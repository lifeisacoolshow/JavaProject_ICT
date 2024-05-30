package j06Exception;
//복사본받기

public class ExceptionTest3 {
    public ExceptionTest3() throws ArrayIndexOutOfBoundsException{
        start();
    }
    public void start() throws ArrayIndexOutOfBoundsException{
        int a=10, b=5;
        System.out.println(a+"+"+b+"="+(a+b));
        divide (6, 0);
    }
    public void divide(int a, int b) throws ArrayIndexOutOfBoundsException{
        System.out.println(a+"/"+b+"="+(a/b));
        arrayTest();
    }
    public void arrayTest()throws ArrayIndexOutOfBoundsException{
        int arr[] = {10,70,23};
        System.out.println(arr[arr.length]);
    }
    public static void main(String[] args) {
          try {
              new ExceptionTest3();
          }catch (ArithmeticException ae){
              System.out.println(ae.getMessage());
          }catch (ArrayIndexOutOfBoundsException aioe){
              System.out.println("배열의 첨가값이 잘못됨");
          }
    }
}
