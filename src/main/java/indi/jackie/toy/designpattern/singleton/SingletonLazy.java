package indi.jackie.toy.designpattern.singleton;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description SingletonLazy 懒汉式<p>静态内部类实现</p>
 */
public class SingletonLazy {
    private SingletonLazy() {
        System.out.println("lazy init");
    }

    private static class Inner {
        private static SingletonLazy singletonLazy = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        System.out.println("SingletonLazy 返回 instance");
        return Inner.singletonLazy;
    }

    public static void doSomethingStatic() {
        System.out.println("lazy do something static");
    }

    public void doSomething() {
        System.out.println("lazy do something");
    }
}
