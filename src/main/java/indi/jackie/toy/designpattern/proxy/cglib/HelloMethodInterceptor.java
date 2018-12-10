package indi.jackie.toy.designpattern.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jackie chen
 * @create 2018/12/10
 * @description HelloMethodInterceptor
 */
public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("sayHello".equalsIgnoreCase(method.getName())) {
            System.out.println("before sayHello...");
        }

        Object result = methodProxy.invokeSuper(obj, args);

        if ("sayHello".equalsIgnoreCase(method.getName())) {
            System.out.println("after sayHello...");
        }

        return result;
    }
}
