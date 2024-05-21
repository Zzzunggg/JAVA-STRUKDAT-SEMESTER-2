/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2LinkedList;

/**
 *
 * @author HP
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        Node current = top;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements are:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
