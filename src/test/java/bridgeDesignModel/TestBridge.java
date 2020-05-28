package bridgeDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.bridgeDesignModel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestBridge {
    @Test
    public void test(){
        //创建接口实现类
        MessageService //messageService = new QQMessageImpl();
                       //messageService = new EmailMessageImpl();
                       messageService = new ShortMessageImpl();
        AbstractMessage abstractMessage = new ImmediatelyMsg();
                        abstractMessage = new DelayMsg();
        abstractMessage.setMessageService(messageService);
        abstractMessage.input();
        abstractMessage.send();
        abstractMessage.save();
    }
}
