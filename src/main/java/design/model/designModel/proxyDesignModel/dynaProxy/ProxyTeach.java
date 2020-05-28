package design.model.designModel.proxyDesignModel.dynaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fyw on 2019/12/17.
 */
public class ProxyTeach {
    //目标对象
    private Object target;

    public ProxyTeach(Object target){
        this.target = target;
    }

    /**
     * 给目标对象生成一个代理对象
     * 1、ClassLoader loader --制定当前对象的类加载器；
     * 2、Class<?>[] interfaces,--目标对象实现的接口类型，使用泛型的方式确认类型
     * 3、InvocationHandler h--事件处理，执行目标对象的方法，会把当前目标对象的方法作为参数传进去
     */

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk动态代理开始。。。");
                        return method.invoke(target,args);
                    }
                });
    }
}
