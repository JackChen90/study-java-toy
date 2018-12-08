package indi.jackie.toy.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description Builder1
 */
public class Builder extends AbsBuilder {

    private List<Integer> sequences = new ArrayList<>();

    private Product product = new Product();

    @Override
    protected void setPart(List<Integer> sequences) {
        this.sequences = sequences;
    }

    @Override
    protected Product builderProduct() {
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
