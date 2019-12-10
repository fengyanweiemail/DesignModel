package builderDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.builderDesignModel.ContreteBuilder;
import design.model.designModel.builderDesignModel.Director;
import design.model.designModel.builderDesignModel.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestBuilder {


    @Test
    public void test(){
        //只需要利用指挥者传参就行了-就能输出对应的复杂产品对象
        Director director = new Director();
        //传入具体的建造者
        director.setAbstractBuilder(new ContreteBuilder());
        //调用不同的方法生成不同的对象--由于是产品对象和建造者是组合的关系，所以product和product1相当于一个对象
        Product product = director.construct();
        product.show();
        Product product1 = director.construct1();
        product1.show();


        director.setAbstractBuilder(new ContreteBuilder());
        //这样product和上面才相当于两个对象
        Product product3 = director.construct1();
        product3.show();
    }
}
