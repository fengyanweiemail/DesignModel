package design.model.designModel.factoryDesignModel.abstractFactory;

/**
 * Created by fyw on 2019/12/4.
 */
public class AbstractFactoryImpl1 implements AbstractFactory {

    private A a;

    @Override
    public void createPrint(String type) {
        if(type.equals("1")){
            a = new A3();
        }else  if(type.equals("2")){
            a = new A4();
        }else{
            a = null;
        }
        a.print();
    }
}
