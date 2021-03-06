package com.bridgelabz;

public class LinkedList<M> {

    Node head, tail;

    public void push(M key) {
        Node<M> nodeData = new Node<>(key);
        if (head == null) {
            head = nodeData;
        } else {
            tail.next = nodeData;
        }
        tail = nodeData;
    }
}

