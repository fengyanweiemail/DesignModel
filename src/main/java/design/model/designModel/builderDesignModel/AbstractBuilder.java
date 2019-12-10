package design.model.designModel.builderDesignModel;

/**
 * Created by fyw on 2019/12/10.
 * 抽象建造者--要组合具体的产品对象
 */
public abstract class AbstractBuilder {
    protected  Product product = new Product();

    /**
     * 创建部件A
     */
    public abstract void builderPartA();

    /**
     * 创建部件B
     */
    public abstract void builderPartB();

    /**
     * 创建部件C
     */
    public abstract void builderPartC();


    public Product getResult(){
        return product;
    }
}
