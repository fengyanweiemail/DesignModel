package factoryDesignModel.old;

import design.model.DesignModelApplication;
import design.model.designModel.factoryDesignModel.old.OrderA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestOld {

    @Test
    public void test(){
        OrderA orderA = new OrderA();
        orderA.setType("2");
        orderA.createPrint();
    }
}
