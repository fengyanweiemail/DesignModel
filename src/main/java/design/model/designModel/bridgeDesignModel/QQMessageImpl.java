package design.model.designModel.bridgeDesignModel;

/**
 * Created by fyw on 2019/12/11.
 */
public class QQMessageImpl implements MessageService{
    @Override
    public void input() {
        //qq自己的输入逻辑
        System.out.println("qq输入信息。。。");
    }

    @Override
    public void send() {
        System.out.println("qq发送消息。。。");
    }

    @Override
    public void save() {
        System.out.println("qq消息保存。。。");
    }
}
