package indi.jackie.toy.designpattern.factory.method;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description AbsProduct
 */
public abstract class AbsProduct {

    public void commonMethod() {
        System.out.println("execute common method");
    }

    protected abstract void absMethod();
}
