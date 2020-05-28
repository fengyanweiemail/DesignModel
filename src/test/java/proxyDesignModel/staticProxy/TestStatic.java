package proxyDesignModel.staticProxy;

import design.model.DesignModelApplication;
import design.model.designModel.proxyDesignModel.staticProxy.ITeachDao;
import design.model.designModel.proxyDesignModel.staticProxy.ProxyTeach;
import design.model.designModel.proxyDesignModel.staticProxy.TeachDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestStatic {
    @Test
    public void test(){
        ITeachDao iTeachDao = new ProxyTeach(new TeachDao());
        iTeachDao.teach();
    }
}
