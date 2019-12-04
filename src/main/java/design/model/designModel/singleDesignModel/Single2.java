package design.model.designModel.singleDesignModel;

/**
 * Created by fyw on 2019/12/2.
 * 饿汉式（静态代码块）和第一种除了写法不一样，其他作用什么的都一样
 */
public class Single2 {

    private Single2(){
    }
    private static Single2 single2;
    static{
        //静态代码块创建单例对象
        single2 = new Single2();
    }

    public static Single2 getInstance(){
        return single2;
    }
}
