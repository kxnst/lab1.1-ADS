package com.company;

public class QueueT3 extends Queue{
    public QueueT3(int size) {
        super(size);
    }

    public void ClearFromNegative(){
        for(int i = 0;i < container.length; i++){
            if(container[i]==null)
                break;
            if(container[i].substring(0,1).equals("-")){
                container[i] = null;
            }
        }
        refresh();
    }
    public Stack ToStack(){
        ClearFromNegative();
        Stack stack = new Stack();
        for(String r:container){
            if(r==null)
                break;
            stack.Push(Integer.toBinaryString(Math.round(Float.valueOf(r))));
        }
        return stack;
    }
}

