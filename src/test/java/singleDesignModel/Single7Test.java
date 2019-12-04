package singleDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.singleDesignModel.Single7;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class Single7Test {
    @Test
    public void test(){
        Single7 single1 = Single7.INSTANCE;
        Single7 single2 = Single7.INSTANCE;
        System.out.println(single1==single2);
        System.out.println("single1:"+single1.hashCode());
        System.out.println("single2:"+single2.hashCode());
        single1.say();

    }
}
