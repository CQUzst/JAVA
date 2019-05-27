package test;

import thread.myThread;

public class myTest {
    public static void main(String[] args) {
        myThread mythread=new myThread();
        Thread a = new Thread(mythread,"A");
        Thread b = new Thread(mythread,"B");
        Thread c = new Thread(mythread,"C");
        Thread d = new Thread(mythread,"D");
        Thread e = new Thread(mythread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
