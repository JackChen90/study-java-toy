package indi.jackie.toy.designpattern.proxy;

import indi.jackie.toy.designpattern.proxy.cglib.Hello;
import indi.jackie.toy.designpattern.proxy.cglib.HelloMethodInterceptor;
import indi.jackie.toy.designpattern.proxy.jdk.HelloImpl;
import indi.jackie.toy.designpattern.proxy.jdk.HelloInvocationHandle;
import indi.jackie.toy.designpattern.proxy.jdk.IHello;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description TestProxy
 */
public class TestProxy {

    @Test
    public void test01() {
        GamePlayerProxy playerProxy = new GamePlayerProxy(new GamePlayer());
        playerProxy.login();
        System.out.println();
        playerProxy.killBoss();
        System.out.println();
        playerProxy.upgrade();
        System.out.println();

        InvocationHandler handle = new HelloInvocationHandle(new HelloImpl());
        IHello hello = (IHello) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{IHello.class}, handle);
        hello.sayHello();

        System.out.println();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Hello.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        Hello helloConcrete = (Hello) enhancer.create();
        helloConcrete.sayHello();
    }
}
