package indi.jackie.toy.designpattern.factory.abstractfactory;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description AbsCreator
 */
public abstract class AbsCreator {

    protected abstract <T extends AbsDoorLeft> T createDoorLeft(Class<T> clazz);

    protected abstract <T extends AbsDoorRight> T createDoorRight(Class<T> clazz);
}
