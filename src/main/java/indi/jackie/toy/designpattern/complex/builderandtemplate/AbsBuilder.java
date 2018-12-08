package indi.jackie.toy.designpattern.complex.builderandtemplate;

import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description AbsBuilder
 */
public abstract class AbsBuilder {

    /**
     * 零件设置列表
     */
    private List<Integer> sequences;

    /**
     * 获取产品的零件设置
     */
    protected abstract List<Integer> getPart();


    protected Product builderProduct() {
        //获取零件列表
        sequences = this.getPart();

        Product product = new Product();
        product.setPart(sequences);
        StringBuilder sb = new StringBuilder();
        for (Integer item : sequences) {
            sb.append(item).append("-");
        }
        String sequence = sb.toString();
        sequence = sequence.substring(0, sequence.length() - 1);
        switch (sequence) {
            case "1-2-3":
                product.setType("炖鱼");
                break;
            case "3-2-1":
                product.setType("鱼汤");
                break;
            default:
                product.setType("一团糟");
                break;
        }
        return product;
    }
}
