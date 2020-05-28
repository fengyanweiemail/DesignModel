package design.model.designModel.bridgeDesignModel;

/**
 * Created by fyw on 2019/12/11.
 */
public class ImmediatelyMsg extends AbstractMessage {

    @Override
    public void input() {
        messageService.input();
        System.out.println("--------即时消息----------");
    }

    @Override
    public void send() {
        messageService.send();
        System.out.println("--------即时消息----------");
    }

    @Override
    public void save() {
        messageService.save();
        System.out.println("--------即时消息----------");
    }
}
