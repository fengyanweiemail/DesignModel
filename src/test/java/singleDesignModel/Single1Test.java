package singleDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.singleDesignModel.Single1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class Single1Test {

    @Test
    public void test(){
        Single1 single1 = Single1.getSingle1();
        Single1 single2 = Single1.getSingle1();
        System.out.println(single1==single2);
        System.out.println("single1:"+single1.hashCode());
        System.out.println("single2:"+single2.hashCode());
    }
    @Test
    public void test1(){
        Single1 single1 = Single1.getSingle1();
        Single1 single2 = Single1.getSingle1();
        single1.setName("111");
        single2.setName("222");
        System.out.println(single1.getName());
        System.out.println(single2.getName());
    }
}
