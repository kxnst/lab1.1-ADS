package com.company;

public class Node {
    String key;
    Node next;

    public Node(String key)
    {
        this.key = key;
        this.next = null;
    }
    public String getKey(){
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
