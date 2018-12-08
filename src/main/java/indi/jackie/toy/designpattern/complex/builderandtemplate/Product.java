package indi.jackie.toy.designpattern.complex.builderandtemplate;

import java.util.List;

/**
 * @author jackie chen
 * @create 2018/12/7
 * @description Product
 */
public class Product {

    private String type;

    private void putOil() {
        System.out.println("放油...");
    }

    private void putFish() {
        System.out.println("放鱼...");
    }

    private void putWater() {
        System.out.println("放水...");
    }

    @Override
    public String toString() {
        return getType();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPart(List<Integer> sequences) {
        for (Integer sequence : sequences) {
            switch (sequence) {
                case 1:
                    this.putOil();
                    break;
                case 2:
                    this.putFish();
                    break;
                case 3:
                    this.putWater();
                    break;
            }
        }
    }

    public void doSomething() {

    }
}
