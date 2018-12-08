package indi.jackie.toy.designpattern.observer;

import org.springframework.stereotype.Component;

/**
 * @author jackie chen
 * @create 2018/11/24
 * @description RefundObserver
 */
@Component
public class ReceiveObserver implements IObserver<String> {

    @Override
    public void update(String s) {
        System.out.println("received message:" + s);
    }
}
