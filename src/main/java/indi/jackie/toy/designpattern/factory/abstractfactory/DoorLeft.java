package indi.jackie.toy.designpattern.factory.abstractfactory;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description DoorLeft
 */
public class DoorLeft extends AbsDoorLeft{
    @Override
    protected void doSomething() {
        System.out.println("left door start assembling...");
    }
}
