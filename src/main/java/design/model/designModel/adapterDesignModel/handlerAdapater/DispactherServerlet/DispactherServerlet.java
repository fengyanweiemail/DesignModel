package design.model.designModel.adapterDesignModel.handlerAdapater.DispactherServerlet;

import design.model.designModel.adapterDesignModel.handlerAdapater.AnnotationAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.HandlerAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.HttpAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.SimpleAdapater;
import design.model.designModel.adapterDesignModel.handlerAdapater.controller.AnnotationController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fyw on 2019/12/9.
 */
public class DispactherServerlet {

    public static List<HandlerAdapater> handlerAdapaters = new ArrayList<>();

    public DispactherServerlet(){
        handlerAdapaters.add(new HttpAdapater());
        handlerAdapaters.add(new SimpleAdapater());
        handlerAdapaters.add(new AnnotationAdapater());
    }

    public HandlerAdapater getHandlerAdapater(Object handler) throws Exception{
        Iterator iterator = handlerAdapaters.iterator();
        while(iterator.hasNext()){
            HandlerAdapater handlerAdapater = (HandlerAdapater)iterator.next();
            if(handlerAdapater.supports(handler)){
                return handlerAdapater;
            }
        }
        throw new  Exception("没有发现对应的类适配器");
    }

    public void doDispatch(Object handler) throws Exception{
        HandlerAdapater handlerAdapater = getHandlerAdapater(handler);
        handlerAdapater.handler(handler);
    }
}
