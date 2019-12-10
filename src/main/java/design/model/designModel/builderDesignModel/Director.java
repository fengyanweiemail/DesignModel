package design.model.designModel.builderDesignModel;

/**
 * Created by fyw on 2019/12/10.
 * 指挥者-聚合抽象的建造者，完成产品的组装输出（负责产品的具体创建流程）
 */
public class Director {
    private AbstractBuilder abstractBuilder;

    /**
     * 通过set方法注入
     * @param abstractBuilder
     */
    public void setAbstractBuilder(AbstractBuilder abstractBuilder){
        this.abstractBuilder = abstractBuilder;
    }

    /**
     * 建造模式1
     * @return
     */
    public Product construct(){
        abstractBuilder.builderPartA();
        abstractBuilder.builderPartB();
        abstractBuilder.builderPartC();
        return abstractBuilder.getResult();
    }

    /**
     * 建造模式2
     * @return
     */
    public Product construct1(){
        abstractBuilder.builderPartA();
        abstractBuilder.builderPartB();
        return abstractBuilder.getResult();
    }
}
