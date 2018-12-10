package indi.jackie.toy.designpattern.builder;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/8
 * @description TestBuilder
 */
public class TestBuilder {

    @Test
    public void test01() {
        AbsBuilder builder = new Builder();
        List<Integer> sequences = Arrays.asList(1, 2, 3);
        builder.setPart(sequences);
        Product product = builder.builderProduct();
        System.out.println(product);

        System.out.println();

        sequences = Arrays.asList(3,2,1);
        builder.setPart(sequences);
        product = builder.builderProduct();
        System.out.println(product);

        System.out.println();

        sequences = Arrays.asList(2,3,1);
        builder.setPart(sequences);
        product = builder.builderProduct();
        System.out.println(product);

        Disorder disorder = new Disorder.Builder()
                .setName("1").setAddress("sdaf").setEmail("a@blackfish.cn").build();
    }
}
