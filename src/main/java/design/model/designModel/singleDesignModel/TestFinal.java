package design.model.designModel.singleDesignModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fyw on 2020/5/15.
 * 没有set方法；不能被继承
 *
 * final类不能被继承，没有子类，final类中的方法默认是final的。
 *
 * final方法不能被子类的方法覆盖，但可以被继承。
 *
 * final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
 *
 * final不能用于修饰构造方法。
 *
 */
public final class TestFinal {
    final List<String> list = new ArrayList<>();

    public void add(String a){
        list.add(a);
        System.out.println(list.hashCode());
        System.out.println(list);
    }

    public List<String> getList() {
        return list;
    }

}
