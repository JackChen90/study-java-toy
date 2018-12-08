package indi.jackie.toy.designpattern.factory.method;

import org.junit.Test;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description TestFactoryMethod
 */
public class TestFactoryMethod {

    @Test
    public void test01() {
        AbsCreator creator = new Creator();
        AbsProduct product = creator.createProduct(Product1.class);
        product.absMethod();
        product = creator.createProduct(Product2.class);
        product.absMethod();
    }
}
