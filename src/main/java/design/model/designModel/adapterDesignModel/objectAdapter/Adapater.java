package design.model.designModel.adapterDesignModel.objectAdapter;

/**
 * Created by fyw on 2019/12/9.
 * 使用合成服用原则替代了继承，比较灵活、实用
 */
public class Adapater implements B {
    A a;
    public Adapater(A a){
        this.a = a;
    }

    @Override
    public int outPut5V() {
        return  a.outPut220V()/44;
    }
}
