package facadeDesignModel;

import design.model.DesignModelApplication;
import design.model.designModel.facadeDesignModel.FacadeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestFacade {

    @Test
    public void test(){
        FacadeClass facadeClass = new FacadeClass();
        facadeClass.start();
        facadeClass.status();
        facadeClass.end();
        //如果直接引入A1、B1、C1调用的话会很麻烦的
    }
}
