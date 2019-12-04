package factoryDesignModel.abstractFactory;

import design.model.DesignModelApplication;
import design.model.designModel.factoryDesignModel.abstractFactory.AbstractFactory;
import design.model.designModel.factoryDesignModel.abstractFactory.AbstractFactoryImpl;
import design.model.designModel.factoryDesignModel.abstractFactory.AbstractFactoryImpl1;
import design.model.designModel.factoryDesignModel.abstractFactory.OrderA;
import design.model.designModel.factoryDesignModel.methodFactory.MethodFactory;
import design.model.designModel.factoryDesignModel.methodFactory.MethodFactoryImpl1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestAbstract {

    @Test
    public void test(){
        //可以根据不同情况，传不同的实现类
        AbstractFactory abstractFactory = new AbstractFactoryImpl();
        OrderA orderA = new OrderA(abstractFactory);
        orderA.createPrint("1");
        orderA.createPrint("2");
        System.out.println("----------------------------");
        AbstractFactory abstractFactory1 = new AbstractFactoryImpl1();
        OrderA orderA1 = new OrderA(abstractFactory1);
        orderA1.createPrint("1");
        orderA1.createPrint("2");
    }
}
