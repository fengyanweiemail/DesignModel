package design.model.designModel.deckerDesignModel.decoratorPac;

import design.model.designModel.deckerDesignModel.Drink;

/**
 * Created by fyw on 2019/12/11.
 * 装饰者，继承顶级父类，抽象构件
 * 同时聚合父类
 */
public class Decorator extends Drink {
    protected Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //自己本身的价格+整体打包进来的价格
        return getPrice()+drink.cost();
    }

    @Override
    public String getDescrise() {
        //此处为什么用super.getDescrise()（它也刚好是它自己本身），因为重写了父类的getDescrise()，不加super的话会无线循环造成报错
        return   super.getDescrise()+" : "+getPrice()+"&"+drink.getDescrise();
    }

}
