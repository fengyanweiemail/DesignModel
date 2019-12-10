package design.model.designModel.adapterDesignModel.classAdapter;

/**
 * Created by fyw on 2019/12/9.
 * 目标用户,用户看到的只是适配器，看不到被适配者
 */
public class Phone {
    public void charge(B b){
        int v = b.outPut5V();
        if(v==5){
            System.out.println("适配成功，可以充电~");
        }
    }
}
