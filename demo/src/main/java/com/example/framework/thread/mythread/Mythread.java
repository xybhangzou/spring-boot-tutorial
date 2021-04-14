package com.example.framework.thread.mythread;

/**
 * @author xnf
 * @DESCRIPTION
 * @date 2021-04-14 21:03
 */
public class Mythread extends Thread{

    @Override
    public void run() {

        super.run();
        System.out.println("Mythread.run");
    }


    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        System.out.println("Mythread.main");
    }
}
