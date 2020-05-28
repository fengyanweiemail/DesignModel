package deckerDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.deckerDesignModel.Drink;
import design.model.designModel.deckerDesignModel.abstractPac.IntadaliaCoffee;
import design.model.designModel.deckerDesignModel.decoratorPac.Chocolate;
import design.model.designModel.deckerDesignModel.decoratorPac.Milk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestDecker {

    @Test
    public void test(){
        //先点一杯coffee
        Drink intadaliaCoffee = new IntadaliaCoffee();
        System.out.println("一杯单品"+intadaliaCoffee.getDescrise()+"的价格"+intadaliaCoffee.cost());
        // 加一份调料牛奶（将牛奶当成一个整体放到牛奶里面）
        Drink milk = new Milk(intadaliaCoffee);
        System.out.println(milk.getDescrise());
        System.out.println("加入一份牛奶后的价格："+milk.cost());
        //在家如一份巧克力（相当于把咖啡和牛奶一起打包放到了巧克力里面）
        Drink chocolate = new Chocolate(milk);//每次都可以利用多态放入Drink，这也是为什么抽象装饰者要聚合自己父类的缘故
        System.out.println(chocolate.getDescrise());
        System.out.println("再加入一份巧克力后的价格："+chocolate.cost());
    }


}
