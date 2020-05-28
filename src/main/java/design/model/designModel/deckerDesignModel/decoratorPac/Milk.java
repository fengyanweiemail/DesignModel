package design.model.designModel.deckerDesignModel.decoratorPac;

import design.model.designModel.deckerDesignModel.Drink;

/**
 * Created by fyw on 2019/12/11.
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescrise("牛奶调味品");
        setPrice(0.2f);
    }
}
