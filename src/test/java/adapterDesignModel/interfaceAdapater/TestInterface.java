package adapterDesignModel.interfaceAdapater;

import design.model.DesignModelApplication;
import design.model.designModel.adapterDesignModel.interfaceAdapater.Adapater;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestInterface {
    @Test
    public void test(){
        Adapater adapater = new Adapater(){
            @Override
            public void a() {
                System.out.println(111111);
            }
        };

        adapater.a();
    }
}
