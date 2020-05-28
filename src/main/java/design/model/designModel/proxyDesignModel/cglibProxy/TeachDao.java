package design.model.designModel.proxyDesignModel.cglibProxy;

import design.model.designModel.proxyDesignModel.dynaProxy.ITeachDao;

/**
 * Created by fyw on 2019/12/17.
 * 具体接口实现类
 */
public  class TeachDao implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("老师在教学。。。");
    }
}
