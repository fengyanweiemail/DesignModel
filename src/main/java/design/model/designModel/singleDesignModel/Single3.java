package design.model.designModel.singleDesignModel;

/**
 * Created by fyw on 2019/12/2.
 * 懒汉式单例
 */
public class Single3 {
    private Single3(){
    }
    private static Single3 single3;

    /**
     * 提供一个静态方法创建单例对象，当使用该方法的时候，才去创建单例对象，即懒汉式
     * 线程不安全（违背了单例）--懒加载
     * 实际开发中，不能使用
     * @return
     */
    public static Single3 getInstance(){
        //线程不安全
        if(single3==null){
            single3 = new Single3();
        }
        return single3;
    }
}
