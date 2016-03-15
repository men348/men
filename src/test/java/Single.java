/**
 * Created by xie on 15/12/28.
 */
public class Single {
//    private static Single instance = new Single();

    public static int count1;
    public static int count2 = 0;

    private static Single instance = new Single();

    private Single(){
        count1 ++;
        count2 ++;
    }

    public static Single getInstance(){
        return instance;
    }

}


class TestSingle{

    public static void main(String[] arg){
        Single instance = Single.getInstance();
        System.out.println(instance.count1);
        System.out.println(instance.count2);
    }

}
