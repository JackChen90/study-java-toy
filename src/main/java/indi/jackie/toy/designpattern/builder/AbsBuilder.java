package indi.jackie.toy.designpattern.builder;

import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description AbsBuilder
 */
public abstract class AbsBuilder {

    /**
     * 设置产品的不同部分，以期望获得不同的产品
     */
    protected abstract void setPart(List<Integer> sequences);

    protected abstract Product builderProduct();
}
