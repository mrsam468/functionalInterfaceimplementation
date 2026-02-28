package org.example.functionalInterface;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method is called");
    }
}

public class RunnableLambdaExample {
    public static void main() {
        Thread threadDemo = new Thread(new ThreadDemo());
        threadDemo.start();
//        IMPLEMENTATION OF THE RUNNABLE FUNCTION WITH LAMBDA EXPRESSION
        Runnable runnable = () -> System.out.println("the run method is called");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
