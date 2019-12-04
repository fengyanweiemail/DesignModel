package design.model.designModel.factoryDesignModel.abstractFactory;

/**
 * Created by fyw on 2019/12/4.
 * 如果扩展一个A3的话，只需要添加A3类和修改工厂方法，但是orderA就不在动了，即：对调用方关闭
 *
 * 满足了依赖倒转原则（面向接口编程原则）--细节依赖抽象，并满足接口隔离原则（接口的最小实现）
 */
public class OrderA {
    private AbstractFactory abstractFactory;
    //之所以这样，可能还存在多个或者多类型的simpleFactory;
    public OrderA(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
    }

    public void createPrint(String type){
        abstractFactory.createPrint(type);
    }
}
