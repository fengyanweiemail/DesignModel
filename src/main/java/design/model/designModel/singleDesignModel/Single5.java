package design.model.designModel.singleDesignModel;

/**
 * Created by fyw on 2019/12/2.
 */
public class Single5 {
    private Single5(){

    }
    //volatile 使属性值快速更新到内存
    private static volatile  Single5 single5;

    /**
     * 既避免了同步块效率问题，也保证了线程的安全性问题，同时又实现了懒汉式的单例加载机制
     * 推荐使用
     * @return
     */
    public static Single5 getInstance(){
        if(single5 == null){
            synchronized (Single5.class){
                if(single5==null){
                    single5 = new Single5();
                }
            }
        }
        return single5;
    }
}
