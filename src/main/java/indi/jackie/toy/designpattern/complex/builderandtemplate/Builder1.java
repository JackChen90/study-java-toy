package indi.jackie.toy.designpattern.complex.builderandtemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description Builder1
 */
public class Builder1 extends AbsBuilder {

    private List<Integer> sequences;

    @Override
    protected List<Integer> getPart() {
        sequences = Arrays.asList(1, 2, 3);
        return sequences;
    }
}
