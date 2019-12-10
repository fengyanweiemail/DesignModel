package design.model.designModel.adapterDesignModel.handlerAdapater;

/**
 * Created by fyw on 2019/12/9.
 * 适配器接口
 */
public interface HandlerAdapater {
    /**
     * 判断传入的controller具体是哪一类controller
     * @param handler
     * @return
     */
    boolean supports(Object handler);

    /**
     * object--传入对应的controller--即类似于对象适配器，只不过使用传参的方式过来了
     * @param handler
     */
    void handler(Object handler);
}
