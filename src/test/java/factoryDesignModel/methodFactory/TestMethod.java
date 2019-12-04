package factoryDesignModel.methodFactory;

import design.model.DesignModelApplication;
import design.model.designModel.factoryDesignModel.methodFactory.MethodFactory;
import design.model.designModel.factoryDesignModel.methodFactory.MethodFactoryImpl;
import design.model.designModel.factoryDesignModel.methodFactory.MethodFactoryImpl1;
import design.model.designModel.factoryDesignModel.methodFactory.OrderA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestMethod {

    @Test
    public void test(){
        //可以根据不同情况，传不同的实现类
        MethodFactory methodFactory = new MethodFactoryImpl();
        OrderA orderA = new OrderA(methodFactory);
        orderA.createPrint("1");
        orderA.createPrint("2");
        System.out.println("----------------------------");
        MethodFactory methodFactory1 = new MethodFactoryImpl1();
        OrderA orderA1 = new OrderA(methodFactory1);
        orderA1.createPrint("1");
        orderA1.createPrint("2");
    }
}
