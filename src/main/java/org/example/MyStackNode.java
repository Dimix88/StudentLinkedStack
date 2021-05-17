package org.example;

public class MyStackNode {

    Student value;
    MyStackNode next;

    public Student getValue() {
        return value;
    }

    public void setValue(Student value) {
        this.value = value;
    }

    public MyStackNode getNext() {
        return next;
    }

    public void setNext(MyStackNode next) {
        this.next = next;
    }
}
