import java.util.ArrayList;
import java.util.List;

/**
 * Created by xie on 15/12/29.
 */
public class Builder {
    //4. 建造者模式,多个实现保存再一个list中
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        int i=0;
        while (i ++ < count) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        int j=0;
        while (j ++ < count) {
            list.add(new SmsSender());
        }
    }

    public void produceWeiXinSender(int count) {
        int k=0;
        while (k ++ < count) {
            list.add(new WeiXinSender());
        }
    }
}
