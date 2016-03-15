/**
 * Created by xie on 15/12/29.
 */
public class Prototype implements Cloneable {

    //5. 原型模式,将一个对象作为原型,对其进行复制克隆
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
}
