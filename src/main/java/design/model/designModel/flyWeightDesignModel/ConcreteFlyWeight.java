package design.model.designModel.flyWeightDesignModel;

/**
 * Created by fyw on 2019/12/12.
 * 具体的享元角色
 */
public class ConcreteFlyWeight extends FlyWeight {
    public ConcreteFlyWeight(){
        super.setName("内部对象实例1：");
    }

    @Override
    public void operation(UnShareFlyWeight unShareFlyWeight) {
        System.out.println(this.hashCode()+"   "+super.getName()+unShareFlyWeight.getType());
    }
}
