package design.model.designModel.proxyDesignModel.staticProxy;

/**
 * Created by fyw on 2019/12/17.
 * 可以在目标对象不变的情况下，扩展功能，
 * 但是要增加方法的话，代理对象和目标对象都要修改
 */
public class ProxyTeach implements ITeachDao {
    private ITeachDao iTeachDao;
    public ProxyTeach(ITeachDao iTeachDao){
        this.iTeachDao = iTeachDao;
    }
    @Override
    public void teach() {
        System.out.println("我想添加什么呢。。。。");
        iTeachDao.teach();
    }
}
