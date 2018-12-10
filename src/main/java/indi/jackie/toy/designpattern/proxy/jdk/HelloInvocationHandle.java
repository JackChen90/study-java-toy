package indi.jackie.toy.designpattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jackie chen
 * @create 2018/12/10
 * @description HelloInvocationHandle
 */
public class HelloInvocationHandle implements InvocationHandler {
    private IHello hello;

    public HelloInvocationHandle(IHello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("sayHello".equalsIgnoreCase(method.getName())) {
            System.out.println("before sayHello...");
        }
        Object result = method.invoke(hello, args);
        if ("sayHello".equalsIgnoreCase(method.getName())) {
            System.out.println("after sayHello...");
        }
        return result;
    }
}
