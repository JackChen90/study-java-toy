package indi.jackie.toy.designpattern.factory.abstractfactory;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description Creator <p>抽象工厂模式中，工厂类中一定会创建多个产品，这些的产品相互间有影响</p>
 */
public class Creator extends AbsCreator {

    @Override
    protected <T extends AbsDoorLeft> T createDoorLeft(Class<T> clazz) {
        AbsDoorLeft doorLeft = null;
        try {
            doorLeft = (AbsDoorLeft) Class.forName(clazz.getName()).newInstance();
            System.out.println("create one left door");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) doorLeft;
    }

    @Override
    protected <T extends AbsDoorRight> T createDoorRight(Class<T> clazz) {
        AbsDoorRight doorRight = null;
        try {
            doorRight = (AbsDoorRight) Class.forName(clazz.getName()).newInstance();
            System.out.println("create one right door");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) doorRight;
    }
}
