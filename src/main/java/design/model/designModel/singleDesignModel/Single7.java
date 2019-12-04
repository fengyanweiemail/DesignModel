package design.model.designModel.singleDesignModel;

/**
 * Created by fyw on 2019/12/2.
 * 枚举方式实现单例，线程安全，且防止反序列化重新创建对象，推荐使用
 */
public enum  Single7 {
    INSTANCE;
    public  void say(){
        System.out.println("ok```");
    }
}
