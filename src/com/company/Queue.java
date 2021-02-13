package com.company;

public class Queue {
    protected Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(Float key) {
        Node temp;
            temp = new Node(key);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public Float dequeue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return temp.key;
    }
    public void Dump(){
        if(front!=null){
            for(Node tmp = front;tmp!=null;tmp=tmp.next)
                System.out.println(tmp.key);
            }
    }
    public int Length(){
        int counter = 0;
        Node tmp;
        for(tmp = front;tmp!=null;++counter,tmp=tmp.next );
        return counter;
    }
}
