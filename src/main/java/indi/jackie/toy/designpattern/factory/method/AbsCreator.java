package indi.jackie.toy.designpattern.factory.method;

/**
 * @author jackie chen
 * @create 2018/12/5
 * @description AbsCreator
 */
public abstract class AbsCreator {

    /**
     * 工厂方法
     * <p>工厂方法使得子类能够决定类实例化时的具体类型</p>
     *
     * @param clazz 子类
     * @param <T> 泛型
     * @return
     */
    protected abstract <T extends AbsProduct> T createProduct(Class<T> clazz);
}
