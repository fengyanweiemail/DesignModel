package design.model.designModel.adapterDesignModel.handlerAdapater;

import design.model.designModel.adapterDesignModel.handlerAdapater.HandlerAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.controller.SimpleController;
import org.springframework.web.servlet.HandlerAdapter;

/**
 * Created by fyw on 2019/12/9.
 */
public class SimpleAdapater implements HandlerAdapater {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}
