package adapterDesignModel.handlerAdapater;

import design.model.DesignModelApplication;
import design.model.designModel.adapterDesignModel.handlerAdapater.DispactherServerlet.DispactherServerlet;
import design.model.designModel.adapterDesignModel.handlerAdapater.HttpAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.SimpleAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.controller.AnnotationController;
import design.model.designModel.adapterDesignModel.handlerAdapater.controller.HttpController;
import design.model.designModel.adapterDesignModel.handlerAdapater.controller.SimpleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fyw on 2019/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignModelApplication.class)
public class TestHandler {
    @Test
    public void test() throws Exception{
        DispactherServerlet dispactherServerlet = new DispactherServerlet();
        AnnotationController annotationController = new AnnotationController();
        dispactherServerlet.doDispatch(annotationController);

        HttpController httpController= new HttpController();
        dispactherServerlet.doDispatch(httpController);

        SimpleController simpleController = new SimpleController();
        dispactherServerlet.doDispatch(simpleController);
    }
}
