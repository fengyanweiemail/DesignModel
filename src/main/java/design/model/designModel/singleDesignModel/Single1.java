package design.model.designModel.singleDesignModel;

/**
 *
 * Runtime--经典的单例模式
 * Created by fyw on 2019/12/2.
 * 饿汉式（静态变量）静态变量线程安全
 *
 * 优点：写法简单，类装载的时候完成实例化，线程安全
 * 缺点：未实现懒加载机制，可能在调用其他静态方法的时候，触发了类加载，但是并未用到实例化对象，如果一直未使用，就导致了内存浪费
 */
public class Single1 {
    /**
     * 1、静态方法，防止外部new
     */
    private Single1(){
    }

    /**
     * 2、内部创建自己的对象(加载创建才能使单例的)
     */
    private final static Single1 single1 = new Single1();
    /**
     * 3、对外部公开一个静态的方法，获取对象(非静态是获取不到的)
     */
    public static Single1 getSingle1(){
        return single1;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
