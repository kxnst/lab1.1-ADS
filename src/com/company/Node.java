package com.company;

public class Node {
    float key;
    Node next;

    public Node(float key)
    {
        this.key = key;
        this.next = null;
    }
    public float getKey(){
        return key;
    }

    public void setKey(float key) {
        this.key = key;
    }
}
