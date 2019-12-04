package design.model.designModel.factoryDesignModel.simpleFactory;

/**
 * Created by fyw on 2019/12/4.
 * 如果扩展一个A3的话，只需要添加A3类和修改工厂方法，但是orderA就不在动了，即：对调用方关闭
 */
public class OrderA {
    private SimpleFactory simpleFactory;
    //之所以这样，可能还存在多个或者多类型的simpleFactory;
    public OrderA(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }

    public void createPrint(String type){
        simpleFactory.createPrint(type);
    }
}
