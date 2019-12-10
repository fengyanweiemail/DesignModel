package design.model.designModel.adapterDesignModel.handlerAdapater;

import design.model.designModel.adapterDesignModel.handlerAdapater.controller.AnnotationController;

/**
 * Created by fyw on 2019/12/9.
 */
public class AnnotationAdapater implements HandlerAdapater{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}
