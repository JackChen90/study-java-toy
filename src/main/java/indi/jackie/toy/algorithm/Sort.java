package indi.jackie.toy.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class Sort {

    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(Sort.class);

    private List<Integer> data;

    public Sort(List<Integer> data) {
        this.data = data;
    }

    /**
     *
     */
    public void quickSort() {
        if (CollectionUtils.isEmpty(this.data)) {
            return;
        }
        int i = 0, j = this.data.size() - 1, k = this.data.size() / 2;
        doQuickSort(i, j, k);
    }

    private void doQuickSort(int i, int j, int k) {
        int start = i;
        int end = j;
        int metric = data.get(k);
        if (i >= j) {
            return;
        }

        while (true) {
            while (data.get(i) < metric) {
                i++;
            }
            while (data.get(j) > metric) {
                j--;
            }
            if (i > j) {
                doQuickSort(start, j, (start + j) / 2);
                doQuickSort(i, end, (end + i) / 2);
                break;
            } else {
                if (i < j) {
                    swap(i, j);
                }
                i++;
                j--;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        this.data.forEach(t -> sb.append(t).append("->"));
        logger.info(sb.toString());
    }
}
