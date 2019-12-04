package singleDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.singleDesignModel.Single4;
import design.model.designModel.singleDesignModel.Single5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class Single5Test {
    @Test
    public void test(){
        Single5 single1 = Single5.getInstance();
        Single5 single2 = Single5.getInstance();
        System.out.println(single1==single2);
        System.out.println("single1:"+single1.hashCode());
        System.out.println("single2:"+single2.hashCode());
    }
}
