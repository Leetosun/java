package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by LeeToSun on 2017/5/11
 * 实现
 */
public class MyInvocation implements InvocationHandler {

    private Object object;

    public MyInvocation(Object o) {
        this.object = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        Object o = method.invoke(object, args);
        System.out.println("end");
        return o;
    }

    public Object getProxy() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = object.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, classes, this);
    }

}
