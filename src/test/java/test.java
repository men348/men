import org.junit.Test;

import java.util.UUID;

/**
 * Created by xie on 15/12/28.
 */
public class test {
    public static void main(String[] arg) {
        String path = test.class.getClassLoader().getResource("").getPath();
        System.out.println(path);
    }
}
