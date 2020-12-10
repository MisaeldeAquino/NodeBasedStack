package com.company;

import com.company.StackInterface;
import java.util.EmptyStackException;

public class NodeBasedStack<T> implements StackInterface<T> {
    // a private Node class
    private class Node {
        T data;
        Node next;

        public Node (T val, Node n) {
            data = val;
            next = n;
        }

        public void setData (T val) {
            data = val;
        }

        public T getData () {
            return data;
        }

        public Node getNext () {
            return next;
        }

        public void setNext (Node n) {
            next = n;
        }
    }
    // end of private Node class
// field of NodeBasedStack class
    Node top;
    int size;
    // constructor of the NodeBasedStack class
    public NodeBasedStack () {
        top = null;
        size = 0;
    }
    // check if the stack is empty
    public boolean isEmpty () {
        return top == null;
    }
    // get the number of elements in the stack
    public int size () {
        return size;
    }
    // add a new element to the top of the stack
    public void push (T val) {
        Node node = new Node(val, top);
        top = node;
        size++;
    }
    // return the top element and remove it from the stack
    public T pop () {
        T data = null;
        if (isEmpty()) throw new EmptyStackException();
        else {
            data = top.getData(); // get the data stored in the top element
            Node tmp = top; // set a tmp pointer points to the top element
            top = top.getNext(); // update the top pointer
            tmp.setNext(null); // update the next pointer of the original top element for GC
            size--;
        }
        return data;
    }
    // return the value of the top element
    public T peek () {
        T data = null;
        if (isEmpty()) throw new EmptyStackException();
        else data = top.getData(); // get the data stored in the top element
        return data;
    }

}