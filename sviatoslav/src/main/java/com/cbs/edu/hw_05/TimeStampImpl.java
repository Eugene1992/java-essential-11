package com.cbs.edu.hw_05;

import java.util.List;
import java.util.Random;

/**
 * Created by Sviatoslav on 25.12.2016.
 */
public class TimeStampImpl implements ITimeStamp{

    private List<Integer> integers;

    public TimeStampImpl(List<Integer> employees) {
        this.integers = employees;
    }

    public double addLastToList(){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            integers.add(new Random().nextInt());
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double addFirstToList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.add(0, new Random().nextInt());
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double addInMiddleToList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.add(list.size()/2, new Random().nextInt());
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    //Get From ArrayList

    public double getMiddleFromList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.get((list.size() - 1 )/2);
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double getLastFromList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.get(list.size() - 1);
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double getFirstFromList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.get(0);
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double setFirstToList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.set(0, new Random().nextInt());
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double setInMiddleToList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.set((list.size() - 1 )/2, new Random().nextInt());
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double setLastToList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.set(list.size() - 1 , new Random().nextInt());
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double removeFirstFromList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.remove(0);
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double removeInMiddleFromList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.remove((list.size() - 1 )/2);
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }

    public double removeLastFromList(List<Integer> list){
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            list.remove(list.size() - 1);
            long endTime = System.nanoTime();
            sum = sum + (endTime - startTime);
        }
        long time = sum/5;

        return time;
    }
}
