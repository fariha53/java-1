package farihaChowdhury;

import com.sun.source.tree.SynchronizedTree;

public class Main {

    public static void main(String[] args) {
        final String  resource1 ="Fariha Chy";
        final String  resource2 ="Sadia Chy";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1 locked resource 2");;
                    }
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 locked resource 2");;

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2 locked resource 1");;
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
