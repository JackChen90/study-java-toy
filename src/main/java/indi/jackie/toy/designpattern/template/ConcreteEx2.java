package indi.jackie.toy.designpattern.template;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description ConcreteEx
 */
public class ConcreteEx2 extends AbsBase{
    @Override
    protected void before() {
        System.out.println("ex2 do something before...");
    }

    @Override
    protected void after() {
        System.out.println("ex2 do something after...");
    }
}
