package com.company;

public class QueueT3 extends Queue{
    public void ClearFromNegative(){
        Node tmp = front;
        if(front!=null) {
            while ((front.getKey()<0))
                front = front.next;
            for (Node current = front; current != null; current = current.next) {
                if (current.getKey()<0) {
                        tmp.next = current.next;
                    if (current.next == null) {
                        rear = tmp;
                    }
                }
                tmp = current;
            }
        }
    }
    public Stack ToStack(){
        ClearFromNegative();
        Stack stack = new Stack(Length());
        if(front!=null) {
            for (Node current = front; current != null; current = current.next) {
                 Float rounded = current.getKey();
                 String val = Integer.toBinaryString((int)(float)rounded);
                 stack.Push(val);
            }
        }
        return stack;
    }
}

