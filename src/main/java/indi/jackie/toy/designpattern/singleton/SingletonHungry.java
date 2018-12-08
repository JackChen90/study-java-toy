package indi.jackie.toy.designpattern.singleton;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description SingletonHungry 饿汉式 <p>优点：没有加锁，执行效率会提高。缺点：类加载时就初始化，浪费内存。</p>
 */
public class SingletonHungry {
    private SingletonHungry() {
        System.out.println("hungry init");
    }

    private static final SingletonHungry singleTon = new SingletonHungry();

    public static SingletonHungry getInstance() {
        System.out.println("SingletonHungry 返回 instance");
        return singleTon;
    }

    public static void doSomethingStatic() {
        System.out.println("hungry do something static");
    }

    public void doSomething() {
        System.out.println("hungry do something");
    }
}
