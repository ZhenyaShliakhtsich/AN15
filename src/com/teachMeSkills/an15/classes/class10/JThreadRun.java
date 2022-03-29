package com.teachMeSkills.an15.classes.class10;

public class JThreadRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Дочерний ранбл поток начался " + Thread.currentThread().getName());
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Я работаю");
        }
        System.out.println("Дочерний ранбл поток завершился " + Thread.currentThread().getName());
    }
}
