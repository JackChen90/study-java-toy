package indi.jackie.toy.designpattern.strategy;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description TestStrategy
 */
public class TestStrategy {
    @Test
    public void test01() {
        Context context = new Context(new Strategy1());
        context.process();

        context =new Context(new Strategy2());
        context.process();
    }
}
