package indi.jackie.toy.designpattern.singleton;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description TestSingleton
 */
public class TestSingleton {

    @Test
    public void test01() {
        SingletonHungry.doSomethingStatic();
        SingletonHungry hungry = SingletonHungry.getInstance();
        hungry.doSomething();

        System.out.println();

        SingletonLazy.doSomethingStatic();
        SingletonLazy lazy = SingletonLazy.getInstance();
        lazy.doSomething();

        System.out.println();

        SingletonLazyV2.doSomethingStatic();
        SingletonLazyV2 lazyV2 = SingletonLazyV2.Instance;
        lazyV2.doSomething();
        lazyV2.doSomething();
        lazyV2.doSomething();
    }
}
