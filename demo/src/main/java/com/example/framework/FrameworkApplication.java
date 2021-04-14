package com.example.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.sql.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@ServletComponentScan
public class FrameworkApplication {
    public static void main(String[] args) {

        SpringApplication.run(FrameworkApplication.class, args);
    }
}

class VolatileTest{

    public static AtomicInteger race = new AtomicInteger(0);
    public static void increase(){
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;
    public static void main(String[] args) {
        Thread [] threads = new Thread[THREADS_COUNT ];
        for(int i = 0 ;i< THREADS_COUNT;i++){
            threads[i] =  new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0 ;i < 10000;i++){
                        increase();
                    }
                }

            });
            threads[i].start();
        }
        while(Thread.activeCount() >1 ){
                Thread.yield();
        }
        System.out.println(race);
    }
}