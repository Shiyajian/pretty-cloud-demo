package com.shiyajian.cloud.file.client.impl;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author shiyajian
 * create: 2019-03-19
 */
@Component
public class Test {

    private static class Node<T> {
        public Node next;
        public T value;

        public Node(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        addMockNodes(first);
        printNodes(first);

        Node after = reverse(first);

        System.out.println("\n");
        printNodes(after);

        //最终结果
        System.out.println("\n");
        System.out.println(after.value);

    }

    private static void printNodes(Node first) {
        Node node = first;
        while (true) {
            if (node.value != null) {
                System.out.print(node.value);
            }
            if (node.next != null) {
                node = node.next;
            } else {
                break;
            }
        }
    }

    private static void addMockNodes(Node first) {
        Node loopNode = first;
        for (int i = 0; i < 10; i++) {
            loopNode.next = new Node(new Random().nextInt(10));
            loopNode = loopNode.next;
        }
    }

    public static Node reverse(Node node) {
        if (node.next == null) {
            return node;
        }
        Node after = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return after;
    }


}
