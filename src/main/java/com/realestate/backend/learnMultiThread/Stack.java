package com.realestate.backend.learnMultiThread;

public class Stack {

    private int arr[];
    private int stackTop;

    private final Object  lock;
    public Stack(int capacity){
        arr=new int[capacity];
        this.stackTop=-1;
        lock=new Object();
    }

    public boolean push(int num){
        synchronized (lock){
            if (isFull())
                return false;
            ++stackTop;
            try{
                Thread.sleep(1000L);
            }catch (InterruptedException e){}
            arr[stackTop]=num;
            return true;
        }
    }
    public int pop(){
        synchronized (lock){
            if(isEmpty())
                return Integer.MIN_VALUE;
            int num=arr[stackTop];
            arr[stackTop]=Integer.MIN_VALUE;
            try{
                Thread.sleep(1000L);
            }catch (InterruptedException e){}
            stackTop--;
            return num;
        }
    }

    //synchronized(this) blocks or synchronized(lock) blocks or just synchronized methods works

    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean isFull(){
        return stackTop >= arr.length - 1;
    }

}
