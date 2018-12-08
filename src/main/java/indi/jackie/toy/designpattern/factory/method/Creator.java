package indi.jackie.toy.designpattern.factory.method;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description Creator
 */
public class Creator extends AbsCreator {
    @Override
    protected <T extends AbsProduct> T createProduct(Class<T> clazz) {
        AbsProduct product;
        try {
            //由产品的子类决定实例化某种产品
            product = (AbsProduct) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return (T) product;
    }
}
