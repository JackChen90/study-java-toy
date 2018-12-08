package indi.jackie.toy.designpattern.observer;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description TestObserver
 */
public class TestObserver {
    @Test
    public void test01(){
        NoticeObservable<String> observable = new NoticeObservable<>();
        observable.addObserver(new ReceiveObserver());
        observable.notice("big message");
    }
}
