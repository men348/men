package jdbc;

import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.util.Properties;

/**
 * Created by xie on 16/3/11.
 */
public class DriverTest {

    @Test
    public void driver(){
        try {
            Driver driver = new Driver();
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            Properties info = new Properties();
            info.put("user","root");
            info.put("password","");
            Connection connection = driver.connect(url,info);
            System.out.println(connection);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
