package indi.jackie.toy.designpattern.template;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description ConcreteEx
 */
public class ConcreteEx extends AbsBase{
    @Override
    protected void before() {
        System.out.println("ex1 do something before...");
    }

    @Override
    protected void after() {
        System.out.println("ex1 do something after...");
    }
}
