package indi.jackie.toy.designpattern.template;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description AbsBase 模板模式使得一些步骤可以延迟到子类中 子类能够不改变算法的结构，重新定义一些具体步骤
 */
public abstract class AbsBase {

    protected abstract void before();

    public void doSomething() {
        before();
        System.out.println("base do something...");
        after();
    }

    protected abstract void after();

}
