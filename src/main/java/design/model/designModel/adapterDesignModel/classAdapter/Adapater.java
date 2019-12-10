package design.model.designModel.adapterDesignModel.classAdapter;

/**
 * Created by fyw on 2019/12/9.
 * 类适配器（继承被适配者实现接口）
 * 单继承，不好用，可以重写父类方法，灵活性强，但是违反了里氏替换原则
 * 父类的所有方法都会在适配器中暴漏，增加了使用成本
 */
public class Adapater extends A implements B{
    @Override
    public int outPut5V() {
        int v = outPut220V();
        return v/44;
    }
}
