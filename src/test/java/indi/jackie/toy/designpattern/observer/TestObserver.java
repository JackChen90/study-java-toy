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
        // 处理map
        observable.addObserver(new ReceiveObserver());

        //通知观察者
        //if ddl 通知观察者ddl 做成同步的
        //if dml 通知观察者dml 做成异步的
        observable.notice("big message");
    }
}
