package design.model.designModel.factoryDesignModel.methodFactory;

/**
 * Created by fyw on 2019/12/4.
 * 如果扩展一个A3的话，只需要添加A3类和修改工厂方法，但是orderA就不在动了，即：对调用方关闭
 *
 * 方法工厂的优点（将具体的类型对象创建下沉到子类的方法实现中）--可以进行工厂类的扩展，比如可以再添加一个类型的工厂实现类MethodFactoryImpl1
 */
public class OrderA {
    private MethodFactory methodFactory;
    //之所以这样，可能还存在多个或者多类型的simpleFactory;
    public OrderA(MethodFactory methodFactory){
        this.methodFactory = methodFactory;
    }

    public void createPrint(String type){
        methodFactory.createPrint(type);
    }
}
