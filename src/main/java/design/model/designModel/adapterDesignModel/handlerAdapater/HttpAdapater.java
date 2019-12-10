package design.model.designModel.adapterDesignModel.handlerAdapater;

import design.model.designModel.adapterDesignModel.handlerAdapater.controller.HttpController;

/**
 * Created by fyw on 2019/12/9.
 */
public class HttpAdapater implements HandlerAdapater {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handler(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}
