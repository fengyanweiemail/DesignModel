package flyWeightDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.flyWeightDesignModel.FlyWeight;
import design.model.designModel.flyWeightDesignModel.FlyWeightAbstract;
import design.model.designModel.flyWeightDesignModel.UnShareFlyWeight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestFlyWeight {

    @Test
    public void test(){
        //源码
        Integer i = Integer.valueOf(127);
        Integer b = Integer.valueOf(126);
    }

    @Test
    public void test1(){
        FlyWeightAbstract flyWeightAbstract = new FlyWeightAbstract();
        FlyWeight concreteFlyWeight = flyWeightAbstract.getInstance("1");
        FlyWeight concreteFlyWeight1 = flyWeightAbstract.getInstance("2");
        concreteFlyWeight.operation(new UnShareFlyWeight("aaa"));
        concreteFlyWeight.operation(new UnShareFlyWeight("bbb"));//再次调用已经存在
        concreteFlyWeight1.operation(new UnShareFlyWeight("ccc"));
        concreteFlyWeight1.operation(new UnShareFlyWeight("ddd"));//再次调用已经存在


        flyWeightAbstract.getInt();//里面总共两个对象
    }

    @Test
    public void test2(){
        FlyWeightAbstract flyWeightAbstract = new FlyWeightAbstract();
        FlyWeight concreteFlyWeight = flyWeightAbstract.getInstance("1");
        concreteFlyWeight.operation(new UnShareFlyWeight("aaa"));
        flyWeightAbstract.getMapHashCode();
        flyWeightAbstract.getInt();


        FlyWeightAbstract flyWeightAbstract1 = new FlyWeightAbstract();
        FlyWeight concreteFlyWeight1 = flyWeightAbstract1.getInstance("1");
        concreteFlyWeight1.operation(new UnShareFlyWeight("ccc"));
        flyWeightAbstract1.getInt();
        flyWeightAbstract1.getMapHashCode();
    }
}
