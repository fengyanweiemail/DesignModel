package design.model.designModel.bridgeDesignModel;

/**
 * Created by fyw on 2019/12/11.
 */
public class ShortMessageImpl implements MessageService {
    @Override
    public void input() {
        //短信自己的输入逻辑
        System.out.println("shortMsg输入信息。。。");
    }

    @Override
    public void send() {
        System.out.println("shortMsg发送消息。。。");
    }

    @Override
    public void save() {
        System.out.println("shortMsg消息保存。。。");
    }
}
