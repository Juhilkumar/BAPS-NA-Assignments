package org.learning.assignment.assignment1;

import java.util.Objects;

class Node {
    String name;
    Node next;

    public Node (String name) {
        this.name = name;
        next = null;
    }
}

public class CompareTwoLinkedList {
    // 1. Write a program to check if two LinkedLists are equal.
    boolean isEqual(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (!Objects.equals(head1.name, head2.name)) {
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return head1 == null && head2 == null;
    }


    public static void main(String[] args) {
        Node list1head = new Node("Juhil");
        Node name1 = new Node("Parth");
        Node name2 = new Node("Mayank");
        list1head.next = name1;
        name1.next = name2;

        Node list2head = new Node("Juhil");
        Node name3 = new Node("Parth");
        Node name4 = new Node("Mayank");
        list2head.next = name3;
        name3.next = name4;

        CompareTwoLinkedList comp = new CompareTwoLinkedList();
        System.out.println(comp.isEqual(list1head, list2head));
    }
}