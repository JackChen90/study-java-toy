package indi.jackie.toy.designpattern.factory.method;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description Builder1
 */
public class Product1 extends  AbsProduct{
    @Override
    protected void absMethod() {
        System.out.println("product1 execute method");
    }
}
