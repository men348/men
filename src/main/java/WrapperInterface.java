/**
 * Created by xie on 15/12/29.
 */
public abstract class WrapperInterface implements SourceAble {

    //接口适配器模式
    public void xixi() {

    }

    public void heihei() {

    }

    public void haha() {

    }
}

class WrapperExtends1 {
    public void xixi() {
        System.out.println("xixi");
    }
}

class WrapperExtends2 {
    public void heihei() {
        System.out.println("heihei");
    }
}

class WrapperExtends3 {
    public void haha() {
        System.out.println("haha");
    }
}
