package indi.jackie.toy.designpattern.singleton;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description SingletonLazyV2 饿汉模式 <p>枚举实现<p/>
 */
public enum SingletonLazyV2 {
    Instance;

    public static void doSomethingStatic() {
        System.out.println("lazyV2 do something static");
    }

    public void doSomething() {
        System.out.println("SingletonLazyV2 枚举 instance hashCode" + this.hashCode());
        //do something else...
        System.out.println("lazyV2 do something else");
    }

    SingletonLazyV2() {
        System.out.println("lazyV2 init");
    }
}
