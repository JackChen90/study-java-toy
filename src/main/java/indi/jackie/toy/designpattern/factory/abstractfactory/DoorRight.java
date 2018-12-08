package indi.jackie.toy.designpattern.factory.abstractfactory;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description DoorRight
 */
public class DoorRight extends AbsDoorRight {
    @Override
    protected void doSomething() {
        System.out.println("right door start assembling...");
    }
}
