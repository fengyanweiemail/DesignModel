package design.model.designModel.factoryDesignModel.methodFactory;

/**
 * Created by fyw on 2019/12/4.
 */
public class MethodFactoryImpl extends MethodFactory{

    private A a;

    @Override
    public void createPrint(String type) {
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
