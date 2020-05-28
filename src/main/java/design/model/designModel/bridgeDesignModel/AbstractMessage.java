package design.model.designModel.bridgeDesignModel;

/**
 * Created by fyw on 2019/12/11.
 */
public abstract class AbstractMessage {
    protected   MessageService messageService;
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public abstract void input();
    public abstract void send();
    public abstract void save();
}
