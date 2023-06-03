package indi.jackie.toy.designpattern.observer;

import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jackie chen
 * @create 2018/11/24
 * @description RefundObserver
 */
@Component
public class ReceiveObserver implements IObserver<String> {

    private ExecutorService executor = Executors.newFixedThreadPool(100);

    @Override
    public void update(String s) {
        //数据扔到线程池
        System.out.println("received message:" + s);
        executor.submit(() -> {
            //先查两边数据
            //再比对数据
            //不一样的往zk输出
        });
    }
}
