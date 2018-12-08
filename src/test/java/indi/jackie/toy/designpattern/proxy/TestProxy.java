package indi.jackie.toy.designpattern.proxy;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description TestProxy
 */
public class TestProxy {

    @Test
    public void test01(){
        GamePlayerProxy playerProxy = new GamePlayerProxy(new GamePlayer());
        playerProxy.login();
        System.out.println();
        playerProxy.killBoss();
        System.out.println();
        playerProxy.upgrade();
        System.out.println();
    }
}
