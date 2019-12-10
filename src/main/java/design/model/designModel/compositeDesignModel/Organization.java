package design.model.designModel.compositeDesignModel;

/**
 * Created by fyw on 2019/12/9.
 * 统一父类：可以是抽象的也可以是接口
 */
public abstract class Organization {

    private String name;
    private String desc;

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 叶子节点可能不需要实现此方法
     */
    public void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization){
        throw new UnsupportedOperationException();
    }

    /**
     * 都需要展示
     */
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
