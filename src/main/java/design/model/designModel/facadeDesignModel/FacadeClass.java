package design.model.designModel.facadeDesignModel;

/**
 * Created by fyw on 2019/12/10.
 * 聚合或者组合各个子系统模块
 */
public class FacadeClass {
    private A1 a1 = new A1();
    private B1 b1 = new B1();
    private C1 c1 = new C1();

    /**
     * 某一项任务将要开始的话，需要A1、B1、C1都准备好，才算开始，组装
     * 如果直接调用A1、B1、C1的start方法，客户端麻烦不？要写多少？
     */
    public void start(){
        a1.aStart1();
        b1.bStart1();
        c1.cStart1();
    }

    public void status(){
        a1.aStatus1();
        b1.bStatus1();
        c1.cStatus1();
    }

    public void end(){
        a1.aEnd1();
        b1.bEnd1();
        c1.cEnd1();
    }
}
