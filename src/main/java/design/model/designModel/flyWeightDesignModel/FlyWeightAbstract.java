package design.model.designModel.flyWeightDesignModel;

import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fyw on 2019/12/12.
 */
public class FlyWeightAbstract {
    //如果是静态成员就是全局的了
    private static  Map<String,FlyWeight> map = new HashMap();



    public FlyWeight getInstance(String type){
        if(!map.containsKey(type)){
            if("1".equals(type)){
                map.put(type,new ConcreteFlyWeight());
            }else if("2".equals(type)){
                map.put(type,new ConcreteFlyWeight2());
            }
        }
        return map.get(type);
    }

    public void getInt(){
        System.out.println(map.size());
    }

    public void getMapHashCode(){
        System.out.println("map的HashCode:"+map.hashCode());
    }
}
