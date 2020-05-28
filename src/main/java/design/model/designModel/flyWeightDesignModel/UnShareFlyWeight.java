package design.model.designModel.flyWeightDesignModel;

/**
 * Created by fyw on 2019/12/12.
 * 外部状态
 */
public class UnShareFlyWeight extends FlyWeight {
    private  String type;

    public UnShareFlyWeight(String type){
        this.type = type;
    }


    public String getType() {
        return type;
    }

    @Override
    public void operation(UnShareFlyWeight unShareFlyWeight) {
        System.out.println("外部状态实例:"+unShareFlyWeight.getType());
    }
}
