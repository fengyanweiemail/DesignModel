package design.model.designModel.singleDesignModel;

/**
 * Created by fyw on 2019/12/2.
 */
public class Single4 {
    private Single4(){

    }

    private static Single4 single4;

    /**
     * 加入同步代码块，解决线程安全问题
     * 懒汉式
     * 缺点：效率太低了，每一次都同步执行，不推荐使用
     * @return
     */
    public static synchronized Single4 getInstance(){
        if(single4==null){
            single4 = new Single4();
        }
        return single4;
    }
}
