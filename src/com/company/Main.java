package com.company;

public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack();
        stack.Push("00001100");
        stack.Push("11111111");
        stack.Push("00000000");
        stack.Push("00001111");
        stack.Push("01010101");
        stack.Dump();
        String a = stack.Peek().getKey();
        String b = stack.Peek().getKey();

        System.out.println("---------------------------");

        stack.Pop();
        stack.Pop();
        stack.Dump();

        System.out.println("---------------------------");

        QueueT3 queue = new QueueT3(6);
        queue.enqueue(123F);
        queue.enqueue((float) -123);
        queue.enqueue(-1232.5F);
        queue.enqueue(1.5F);
        queue.ClearFromNegative();

        queue.Dump();

        System.out.println("---------------------------");

        Stack stack2 = queue.ToStack();
        stack2.Dump();
    }
}
