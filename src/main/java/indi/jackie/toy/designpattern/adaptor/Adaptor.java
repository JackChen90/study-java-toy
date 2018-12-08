package indi.jackie.toy.designpattern.adaptor;

/**
 * @author jackie chen
 * @create 2018/12/6
 * @description Adaptor 类适配器
 */
public class Adaptor extends Adaptee implements ITarget {

    @Override
    public String getTargetId() {
        return String.valueOf(super.getId());
    }

    @Override
    public String getTargetName() {
        return super.getName();
    }
}
