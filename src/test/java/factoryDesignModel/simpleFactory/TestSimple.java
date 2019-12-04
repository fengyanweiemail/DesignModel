package factoryDesignModel.simpleFactory;

import design.model.DesignModelApplication;
import design.model.designModel.factoryDesignModel.simpleFactory.OrderA;
import design.model.designModel.factoryDesignModel.simpleFactory.SimpleFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestSimple {

    @Test
    public void test(){
        OrderA orderA = new OrderA(new SimpleFactory());
        orderA.createPrint("1");
        orderA.createPrint("2");
    }
}
