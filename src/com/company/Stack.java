package com.company;

import java.security.InvalidParameterException;

public class Stack {
    private String[] container;
    private int last = -1;
    public boolean isFull(){
        return (last==(container.length-1));
    }
    public boolean isEmpty(){
        return last==-1;
    }
    public static boolean Validate(String value){
        return value.matches("^([01]+)$");
    }
    public Stack(int size){
        container = new String[size];
    }
    public void Push(String value){
        if(!Validate(value)){
            throw new InvalidParameterException("Invalid Parameter");
        }
        if(isFull()){
            throw new IndexOutOfBoundsException("Stack Overflow)))))");
        }
        container[++last] = value;
    }
    public String Pop() {
        if (isEmpty())
            return null;
        String tmp =  container[last];
        container[last] = null;
        last--;
        return tmp;
    }
    public String Peek(){
        if (isEmpty())
            return null;
        return container[last];
    }
    public void Dump(){
        for(String el:container){
            System.out.println(el);
        }
    }

}
