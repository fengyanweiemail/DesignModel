package design.model.designModel.builderDesignModel;

/**
 * Created by fyw on 2019/12/10.
 * 具体建造者
 */
public class ContreteBuilder extends AbstractBuilder{
    @Override
    public void builderPartA() {
        product.setPartA("这是具体建造者创建的部件A");
    }

    @Override
    public void builderPartB() {
        product.setPartB("这是具体建造者创建的部件B");
    }

    @Override
    public void builderPartC() {
        product.setPartC("这是具体建造者创建的部件C");
    }
}
