package singleDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.singleDesignModel.Single2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class Single2Test {

    @Test
    public void test(){
        Single2 single1 = Single2.getInstance();
        Single2 single2 = Single2.getInstance();
        System.out.println(single1==single2);
        System.out.println("single1:"+single1.hashCode());
        System.out.println("single2:"+single2.hashCode());
    }
}
