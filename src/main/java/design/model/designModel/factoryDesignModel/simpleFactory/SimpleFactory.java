package design.model.designModel.factoryDesignModel.simpleFactory;

/**
 * Created by fyw on 2019/12/4.
 */
public class SimpleFactory {
    private A a;

    public void createPrint(String type){
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
