package indi.jackie.toy.designpattern.strategy;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description Client 封装类 封装策略 策略模式的本质，是运用面向对象的继承和多态
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void process() {
        strategy.doSomething();
    }
}
