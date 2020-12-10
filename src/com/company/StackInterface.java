package com.company;

public interface StackInterface<T> {
    void push(T data);
    T pop();
    boolean isEmpty();
}
