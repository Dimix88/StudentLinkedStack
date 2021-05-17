package org.example;

public class MyStack {

    MyStackNode data;

    public MyStack() {
        data = null;
    }

    public void push(Student value){
        if(data == null){
            data = new MyStackNode();
            data.setValue(value);
            data.setNext(null);
        }
        else{
            MyStackNode temp = new MyStackNode();
            temp.setValue(value);
            temp.setNext(data);
            data = temp;
        }
    }

    public boolean isEmpty(){
        if(data==null){
            return true;
        }
        else{
            return false;
        }

    }
    public Student peek(){
        return data.getValue();
    }

    public Student pop(){
        Student value = data.getValue();
        data = data.getNext();
        return value;
    }
}
