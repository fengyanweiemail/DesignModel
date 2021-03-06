package adapterDesignModel.objectAdapater;

import design.model.DesignModelApplication;
import design.model.designModel.adapterDesignModel.objectAdapter.A;
import design.model.designModel.adapterDesignModel.objectAdapter.Adapater;
import design.model.designModel.adapterDesignModel.objectAdapter.Phone;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestObjectAdapater {

    @Test
    public void test(){
        Phone phone = new Phone();
        phone.charge(new Adapater(new A()));
    }
}
