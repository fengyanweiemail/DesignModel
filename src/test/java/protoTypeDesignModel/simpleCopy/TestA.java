package protoTypeDesignModel.simpleCopy;

import design.model.DesignModelApplication;
import design.model.designModel.protoTypeDesignModel.simpleCopy.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestA {

    @Test
    public  void test(){
        A a = new A();
        a.setAge(1);
        a.setName("小明");
        a.setSex("男");
        A a1 = (A)a.clone();
        a1.setName("小红");
        System.out.println("a:"+a+"---name的hascode:"+a.getName().hashCode());
        System.out.println("a1:"+a1+"---name的hascode:"+a1.getName().hashCode());
    }
}
