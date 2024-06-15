package com.realestate.backend.learnMultiThread;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Entering into main thread");
//        Thread t1=new Thread1("Thread1");
//        t1.setDaemon(false);
//        t1.start();
//
//        Thread t2= new Thread(new Thread2(),"Thread2withRunnable");
//        t2.start();
//
//        Thread t3=new Thread(()->{
//            for(int i=0;i<5;i++){
//                System.out.println(Thread.currentThread());
//            }
//        }, "Thread3withLambdaRunnable");
//        t3.start();

//        //Learning synchronization
//        Stack s= new Stack(5);
//
//
//        new Thread(()->{
//            int counter=10;
//            while(counter-- > 0){
//                System.out.println("Pushing number to stack: "+ s.push(1000));
//            }
//        },"Pusher" ).start();
//
//        new Thread(()->{
//            int counter=10;
//            while (counter-- > 0){
//                System.out.println("Popping number from stack: {}" + s.pop());
//            }
//        }, "Popper").start();


        Thread t3=new Thread(()->{
            try {
                Thread.sleep(1L);
                for(int i=0;i<1000;i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"ThreadStates");
        t3.start();
        while(true){
            Thread.State t3State=t3.getState();
            System.out.println(t3State);
            if(t3State==Thread.State.TERMINATED) break;
        }
        System.out.println("main is exiting");
    }

    //Thread States


}
