package indi.jackie.toy.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jackie chen
 * @create 2019/3/5
 * @description TestSort
 */
public class TestSort {

    @Test
    public void test01() {
        List<Integer> data = new ArrayList<>();
        initData(data);
        Sort sort = new Sort(data);
        sort.print();
        sort.quickSort();
        sort.print();
    }

    private void initData(List<Integer> data) {
        data.add(4);
        data.add(8);
        data.add(5);
        data.add(1);
        data.add(7);
        data.add(4);
        data.add(2);
        data.add(3);
    }
}
