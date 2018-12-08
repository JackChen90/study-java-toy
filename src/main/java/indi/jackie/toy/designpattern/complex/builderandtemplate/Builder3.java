package indi.jackie.toy.designpattern.complex.builderandtemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description Builder1
 */
public class Builder3 extends AbsBuilder {

    private List<Integer> sequences;

    @Override
    protected List<Integer> getPart() {
        sequences = Arrays.asList(2, 3, 1);
        return sequences;
    }
}
