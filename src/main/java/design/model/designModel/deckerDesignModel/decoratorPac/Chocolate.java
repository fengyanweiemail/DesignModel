package design.model.designModel.deckerDesignModel.decoratorPac;

import design.model.designModel.deckerDesignModel.Drink;

/**
 * Created by fyw on 2019/12/11.
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDescrise("调味品巧克力");
        setPrice(0.1f);
    }
}
