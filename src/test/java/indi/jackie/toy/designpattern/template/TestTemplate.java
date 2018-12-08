package indi.jackie.toy.designpattern.template;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description TestTemplate
 */
public class TestTemplate {

    @Test
    public void test01() {
        AbsBase base = new ConcreteEx();
        base.doSomething();
        System.out.println();
        base = new ConcreteEx2();
        base.doSomething();
    }
}
