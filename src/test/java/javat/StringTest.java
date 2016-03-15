package javat;

import org.junit.Test;

/**
 * Created by xie on 16/3/11.
 */
public class StringTest {

    @Test
    public void test() {
        String str1 = "a"+"b"+1;
        String str2 = "ab1";
        System.out.println(str1 == str2);
    }

    @Test
    public void test2() {
        String a = "a";
        final String b = "a";

        String c = a + "b";
        String d = b + "b";
        String e = "ab";
        String f = "a" + "b";
        String g = getA();

        System.out.println(c == e);
        System.out.println(d == e);
        System.out.println(f == e);
        System.out.println(g == e);
    }

    public String getA() {
        return "a";
    }


    @Test
    public void test3() {
        int a = 1;
        int b = 2;
        System.out.println("交换前a=" + a);
        System.out.println("交换前b=" + b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("交换后a=" + a);
        System.out.println("交换后b=" + b);
    }

    @Test
    public void test4() {
        Integer a = 1;
        Integer b = 1;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }

    @Test
    public void test5() {
        int a = 1;
        int b = 2;
        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("交换后a=" + a);
        System.out.println("交换后b=" + b);
    }
}
