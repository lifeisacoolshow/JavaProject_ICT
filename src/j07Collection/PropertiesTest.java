package j07Collection;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public PropertiesTest() {
        //Properties 는 key와 value 모두 String이다.
        Properties prop = new Properties();

        //객체추가
        prop.setProperty("/","http://www.nate.com");
        prop.setProperty("/news","http://www.nate.com/list");
        prop.setProperty("/notice","http://www.nate.com/view");
        prop.setProperty("/notice/write","http://www.nate.com/write");

        //객체얻어오기
        String url = prop.getProperty("/notice");
        System.out.println(url);

        //모든 key 얻어오기
        Enumeration key = prop.propertyNames();
        while(key.hasMoreElements()){
            System.out.println(key.nextElement());
        }
    }

    public static void main(String[] args) {
        new PropertiesTest();
    }
}
