/**
 * Created by xie on 15/12/28.
 */
public class Singleton {
    //3. 单例模式,在一个jvm中,只有一个实例存在
    private static Singleton instance = null;

    private Singleton() {

    }

    //静态方法用于创建或返回对象,多线程不安全
    public static Singleton getInstance1() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //在方法上使用synchronized,在调用时,会锁住对象,速度减慢
    public static synchronized Singleton getInstance2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //只在创建时锁住对象,一次创建,不会减慢速度
    public static Singleton getInstance3() {
        if (instance == null) {
            synchronized (instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public Singleton getResolve() {
        return instance;
    }

}
