package indi.jackie.toy.designpattern.factory.abstractfactory;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description TestAbstractFactory
 */
public class TestAbstractFactory {

    @Test
    public void test01() {
        AbsCreator creator = new Creator();
        AbsDoorLeft doorLeft = creator.createDoorLeft(DoorLeft.class);
        doorLeft.doSomething();
        AbsDoorRight doorRight = creator.createDoorRight(DoorRight.class);
        doorRight.doSomething();
    }
}
