package indi.jackie.toy.designpattern.adaptor;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description TestAdaptor
 */
public class TestAdaptor {

    @Test
    public void test01() {
        Adaptor adaptor = new Adaptor();
        String targetId = adaptor.getTargetId();
        System.out.println(targetId);
        String targetName = adaptor.getTargetName();
        System.out.println(targetName);
    }
}
