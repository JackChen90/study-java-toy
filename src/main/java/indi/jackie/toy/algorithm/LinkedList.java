package indi.jackie.toy.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jackie chen
 * @create 2019/3/4
 * @description LinkedList
 */
public class LinkedList {

    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(LinkedList.class);

    private Node head;

    /**
     * 反转链表
     *
     * @return
     */
    public void reverse() {
        Node originHead = head;
        Node e = head;
        if (e == null || e.next == null) {
            return;
        }

        Node next = e.next;
        Node temp;
        while (next.next != null) {
            temp = next.next;
            next.next = e;
            e = next;
            next = temp;
        }
        next.setNext(e);
        e = next;
        originHead.next = null;
        head = e;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void print() {
        Node temp = this.head;
        if (temp == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (temp.next != null) {
            sb.append(temp.data)
                    .append("->");
            temp = temp.next;
        }
        sb.append(temp.data);
        logger.info(sb.toString());
    }

    public static class Node {
        private Integer data;
        private Node next;

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
