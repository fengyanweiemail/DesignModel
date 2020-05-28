package proxyDesignModel.dynaProxy;

import design.model.DesignModelApplication;
import design.model.designModel.proxyDesignModel.dynaProxy.ITeachDao;
import design.model.designModel.proxyDesignModel.dynaProxy.ProxyTeach;
import design.model.designModel.proxyDesignModel.dynaProxy.TeachDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestDyna {
    @Test
    public void test(){
        ProxyTeach proxyTeach = new ProxyTeach(new TeachDao());
        //如果要使用动态代理的话，就需要用接口父类进行强转，如果没有实现接口，默认用cglib代理
        ITeachDao iTeachDao = (ITeachDao)proxyTeach.getProxy();
        System.out.println(proxyTeach.getProxy().getClass());
        System.out.println(iTeachDao.getClass());
        iTeachDao.teach();
    }
}
