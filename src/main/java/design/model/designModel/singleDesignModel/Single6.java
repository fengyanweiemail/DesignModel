package design.model.designModel.singleDesignModel;

/**
 * Created by fyw on 2019/12/2.
 */
public class Single6 {
    private Single6(){

    }

    /**
     * 静态内部类
     * 1、类加载的时候，静态内部类，并不会加载
     * 2、当使用公用方法，调用静态内部类的使用，会使得静态内部类加载，而类加载的时候是线程安全的（类的静态属性‘只会在第一次’的时候初始化）
     */
    private static class Single6Instance{
        //single6-应该大写
        private static final Single6 single6 = new Single6();
    }

    public static Single6 getInstance(){
        return Single6Instance.single6;
    }
}
