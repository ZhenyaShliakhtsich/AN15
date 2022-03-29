package com.teachMeSkills.an15.classes.class10;

public class JThread extends Thread {

    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(String.format("Поток %s начался", Thread.currentThread().getName()));
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Я жив");

        }
        System.out.println(String.format("Поток %s завершился", Thread.currentThread().getName()));
    }
}
