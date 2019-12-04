package design.model.designModel.factoryDesignModel.old;

/**
 * Created by fyw on 2019/12/4.
 *
 * 缺点：如果我想要添加一个A3实现类，那么OrderA也要改，如果有多个类似OrderA的地方，都需要改，违反了ocp原则
 */
public class OrderA {
    private A a;

    private String type;
    public void setType(String type){
        this.type = type;
    }
    public void createPrint(){
        if(type.equals("1")){
            a = new A1();
        }else  if(type.equals("2")){
            a = new A2();
        }else{
            a = null;
        }
        a.print();
    }
}
