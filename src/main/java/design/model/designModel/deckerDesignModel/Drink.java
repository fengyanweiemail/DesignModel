package design.model.designModel.deckerDesignModel;

import design.model.designModel.deckerDesignModel.abstractPac.Coffee;

/**
 * Created by fyw on 2019/12/11.
 * 抽象构件，顶级父类
 */
public abstract class Drink {
    /**
     * 描述
     */
    private String descrise;
    /**
     * 单价
     */
    private float price = 0.0f;
    /**
     * 费用叠加计算，利用递归形式
     */
    public abstract float cost();

    public String getDescrise() {
        return descrise;
    }

    public void setDescrise(String descrise) {
        this.descrise = descrise;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
