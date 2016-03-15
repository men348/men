/**
 * Created by xie on 15/12/29.
 */
public class Adapter extends Source implements Targetable {

    //6. 适配器模式,类的适配模式,利用继承
    public void hehe(){
        System.out.println("hehe");
    }
}

class Wrapper implements Targetable {

    //6. 对象的适配模式,在本类中引入一个用到的对象
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    public void hehe(){
        System.out.println("hehe");
    }

    public void haha(){
        source.haha();
    }
}
