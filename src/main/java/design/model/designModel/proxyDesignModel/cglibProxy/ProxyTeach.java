package design.model.designModel.proxyDesignModel.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fyw on 2019/12/17.
 * cglib代理，被代理类不需要实现接口就行
 */
public class ProxyTeach implements MethodInterceptor {
    //目标对象
    private Object target;

    public ProxyTeach(Object target){
        this.target = target;
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始。。。");
        Object result = method.invoke(target,objects);
        System.out.println("代理结束。。。");
        return result;
    }

    /**
     * 代理方法的实现
     * @param target
     * @return
     */
    public Object proxyMethod(Object target){
        Enhancer enhancer = new Enhancer();
        //设置一个需要代理的对象
        enhancer.setSuperclass(target.getClass());
        //设置代理人
        enhancer.setCallback(new ProxyTeach(target));
        return enhancer.create();
    }
}
