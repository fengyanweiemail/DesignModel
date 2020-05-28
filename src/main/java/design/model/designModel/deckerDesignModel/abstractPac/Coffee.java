package design.model.designModel.deckerDesignModel.abstractPac;

import design.model.designModel.deckerDesignModel.Drink;

/**
 * Created by fyw on 2019/12/11.
 * 继承drink，为具体构件的抽象缓冲层
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        //对于一个coffee来言，价格就是它的花费
        return super.getPrice();
    }
}
