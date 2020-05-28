package design.model.designModel.bridgeDesignModel;

/**
 * Created by fyw on 2019/12/11.
 */
public class EmailMessageImpl implements MessageService {
    @Override
    public void input() {
        //email自己的输入逻辑
        System.out.println("email输入信息。。。");
    }

    @Override
    public void send() {
        System.out.println("email发送消息。。。");
    }

    @Override
    public void save() {
        System.out.println("email消息保存。。。");
    }
}
