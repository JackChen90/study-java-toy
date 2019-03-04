package indi.jackie.toy.algorithm;

import org.junit.Test;

import java.awt.*;

/**
 * @author jackie chen
 * @create 2019/3/4
 * @description TestLinkedList
 */
public class TestLinkedList {

    @Test
    public void test01() {
        LinkedList.Node head = new LinkedList.Node();
        initLink(head);
        LinkedList linkedList = new LinkedList(head);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }

    private void initLink(LinkedList.Node head) {
        head.setData(0);
        LinkedList.Node e = head;
        LinkedList.Node node;
        for (int i = 1; i < 6; i++) {
            node = new LinkedList.Node();
            node.setData(i);
            e.setNext(node);
            e = node;
        }
    }
}
