package dynamic_proxy_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by LeeToSun on 2017/6/5
 */
public class ServiceProxy implements InvocationHandler {

    private Object object;

    public ServiceProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        morning();
        Object o = method.invoke(object, args);
        night();
        return o;
    }

    private void morning() {
        System.out.println("早上好");
    }

    private void night() {
        System.out.println("晚上好");
    }

    public Object getObject() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

}
