package com.company;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;

public class Stack {

    private Node last = null;

    public boolean isEmpty(){
        return last==null;
    }

    public static boolean Validate(String value){
        return value.matches("^([01]+)$");
    }

    public Stack(){
    }
    public void Push(String value){
        if(!Validate(value)){
            System.out.println(value);
            throw new InvalidParameterException("Invalid Parameter");
        }
        Node tmp = new Node(value);
        tmp.next = last;
        last = tmp;
    }
    public Node Pop() {
        if (isEmpty())
            return null;
        Node tmp = last;
        last = last.next;
        return tmp;
    }
    public Node Peek(){
        if (isEmpty())
            return null;
        Node tmp = last;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        return tmp;
    }
    public void Dump(){
        Node tmp = last;
        if(isEmpty())
            return;
        while(tmp!=null){
            System.out.println(tmp.getKey());
            tmp = tmp.next;
        }
    }

}
