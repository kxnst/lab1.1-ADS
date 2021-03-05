package com.company;

public class Queue {
    protected String[] container;
    public Queue(int size) {
        container = new String[size];
    }

    public void enqueue(float param) {
        String key = String.valueOf(param);
        int counter = 0;
        for(String tmp:container){
            if(container[counter]==null){
                container[counter] = key;
                break;
            }
            counter++;
        }
        refresh();
    }
    protected void refresh(){
        String[] tmp = new String[container.length];
        int counter = 0;
        for(String r:container){
            if(r==null)
                continue;
            else
                container[counter++] = r;
        }

    }
    public String dequeue() {
        if(container.length>0)
            return container[0];
        return null;
    }
    public void Dump(){
        for(String r:container){
            System.out.println(r);
        }
    }
    public int Length(){
       return container.length;
    }
}
