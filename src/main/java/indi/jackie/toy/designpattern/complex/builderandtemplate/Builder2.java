package indi.jackie.toy.designpattern.complex.builderandtemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description Builder2
 */
public class Builder2 extends AbsBuilder {

    private List<Integer> sequences;

    @Override
    protected List<Integer> getPart() {
        sequences = Arrays.asList(3, 2, 1);
        return sequences;
    }
}
