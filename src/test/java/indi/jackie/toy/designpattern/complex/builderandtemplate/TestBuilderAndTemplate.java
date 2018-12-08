package indi.jackie.toy.designpattern.complex.builderandtemplate;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/8
 * @description TestBuilderAndTemplate
 */
public class TestBuilderAndTemplate {

    @Test
    public void test01() {
        AbsBuilder builder = new Builder1();
        Product product = builder.builderProduct();
        System.out.println(product);

        System.out.println();

        builder = new Builder2();
        product = builder.builderProduct();
        System.out.println(product);

        System.out.println();

        builder = new Builder3();
        product = builder.builderProduct();
        System.out.println(product);
    }
}
