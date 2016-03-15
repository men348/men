/**
 * Created by xie on 15/12/28.
 */
public class SenderFactory {
    /*
    *1. 工厂模式
    * */
    //第一种工厂模式,普通工厂
    public Sender produce(String type) {
        if (type.equals("mail")) {
            return new MailSender();
        }else {
            return new SmsSender();
        }
    }



    //第二种工厂模式,多个工厂模式
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }



    //第三种静态工厂模式,不需要创建实例
    public static Sender produceStaticMail() {
         return new MailSender();
    }

    public static Sender produceStaticSms() {
        return new SmsSender();
    }





}


class Mail{
    /*
    * 2. 抽象工厂模式,为每一个实现类的创建单独写一个类
    * */
    public Sender getMail() {
        return new MailSender();
    }
}

class Sms{
    public Sender getSms() {
        return new SmsSender();
    }
}
