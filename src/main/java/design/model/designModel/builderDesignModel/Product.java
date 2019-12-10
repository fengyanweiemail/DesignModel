package design.model.designModel.builderDesignModel;

/**
 * Created by fyw on 2019/12/10.
 * 产品对象
 */
public class Product {
    //这只是一个简单的例子，也有可能是对象A、对象B、对象C这样就复杂了
    private String partA;//部件1
    private String partB;//部件2
    private String partC;//部件3

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    /**
     * 展示产品信息
     */
    public void show(){
        System.out.println(partA+"---"+partB+"----"+partC);
    }
}
