package com.teachMeSkills.an15.classes.class10;

public class ThreadMain {
    public static void main(String[] args) {

//        System.out.println(Thread.currentThread());
//        System.out.println("Имя родительского потока: " + Thread.currentThread().getName());
//        System.out.println("Id родительского потока: " + Thread.currentThread().getId());
//        System.out.println("Имя группы родительского потока: " + Thread.currentThread().getThreadGroup().getName());
//        System.out.println("Приоритет родительского потока: " + Thread.currentThread().getPriority());

//        System.out.println("Родительский поток начался " + Thread.currentThread().getName());
//        try {
//            JThread jThread = new JThread("Дочерний");
//            jThread.start();
////            jThread.join();
//            Thread.sleep(1000);
//            jThread.interrupt();
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Родительский поток закончился " + Thread.currentThread().getName());


//        for (int i = 0; i < 10; i++) {
//            System.out.println(new Thread("Поток " + i).getName());
//        }


        System.out.println("Родительский поток начался "  + Thread.currentThread().getName());
        JThreadRun jThreadRun = new JThreadRun();
        Thread thread = new Thread(jThreadRun, "Дочерний Ранбл");
        thread.start();

        try {
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Родительский поток завершился "  + Thread.currentThread().getName());
    }
}
