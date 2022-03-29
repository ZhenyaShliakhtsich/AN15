package com.teachMeSkills.an15.classes.class10;

public class TaskMain {
    public static void main(String[] args) throws InterruptedException {
        int[] values = {10, 7, 4, 1, -1, 100, 987};

        MathThread mathThread = new MathThread(values);
        mathThread.getThread().start();
        System.out.println(mathThread.getThread().getState());
        System.out.println(mathThread.getThread().getName());
        System.out.println(mathThread.getThread().getState());

        try {

            System.out.println(mathThread.getThread().getState());

            System.out.println(mathThread.getThread().getState());
            mathThread.getThread().join();
mathThread.getThread().interrupt();
            System.out.println(mathThread.getThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(mathThread.getThread().getState());
        System.out.println(mathThread.getMaxValue());
        System.out.println(mathThread.getMinValue());

        System.out.println(mathThread.getThread().getState());

    }
}
