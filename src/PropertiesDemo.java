import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class PropertiesDemo {
    public static void main(String[] args)throws Exception {
        Properties p=new Properties();
        FileInputStream input = new FileInputStream("src/Input.properties");
        p.load(input);
        System.out.println(p);
        System.out.println(p.getProperty("name"));
        p.setProperty("name","Reena");//it replaces riya with reena
        System.out.println(p.getProperty("name"));
        FileOutputStream output=new FileOutputStream("src/Input.properties");
        p.store(output,"updated by Reena Kamboj");
    }
}
