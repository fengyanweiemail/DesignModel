package design.model.designModel.flyWeightDesignModel;

/**
 * Created by fyw on 2019/12/12.
 * 抽象享元构件
 */
public abstract class FlyWeight {
    private String name;

    public abstract void operation(UnShareFlyWeight unShareFlyWeight);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
