package indi.jackie.toy.designpattern.proxy.jdk;

/**
 * @author jackie chen
 * @create 2018/12/10
 * @description HelloImpl
 */
public class HelloImpl implements IHello {
    @Override
    public void sayHello() {
        System.out.println("hello jdk proxy");
    }
}
