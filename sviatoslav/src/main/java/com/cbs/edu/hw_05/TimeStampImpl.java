package com.cbs.edu.hw_05;

import java.util.List;

/**
 * Created by Sviatoslav on 25.12.2016.
 */
public class TimeStampImpl implements ITimeStamp {

    private List<Integer> integers;
    private final int sec = 100000000;

    enum Insert {
        FIRST, MIDDLE, LAST
    }

    public TimeStampImpl(List<Integer> integers) {
        this.integers = integers;
    }

    public double add(Insert insert, int element, int manyTimes) {
        double time = 0;
        switch (insert) {

            case FIRST:
                long startTime = System.nanoTime();
                for (int i = 0; i < manyTimes; i++) {
                    integers.add(0, element);
                }
                long endTime = System.nanoTime();
                time = (endTime - startTime) / manyTimes;
                return time / sec;

            case MIDDLE:
                startTime = System.nanoTime();
                for (int i = 0; i < manyTimes; i++) {
                    integers.add(integers.size() / 2, element);
                }
                endTime = System.nanoTime();
                time = (endTime - startTime) / manyTimes;
                return time / sec;

            case LAST:
                startTime = System.nanoTime();
                for (int i = 0; i < manyTimes; i++) {
                    integers.add(element);
                }
                endTime = System.nanoTime();
                time = (endTime - startTime) / manyTimes;
                return time / sec;

            default:
                System.out.println("Error! Insert FIRST , MIDDLE or LAST please");
        }
        return time;
    }

    public double get(Insert insert, int manyTimes) {
        double time = 0;
        if (!integers.isEmpty()) {
            switch (insert) {

                case FIRST:

                    long startTime = System.nanoTime();
                    for (int i = 0; i < manyTimes; i++) {
                        integers.get(0);
                    }
                    long endTime = System.nanoTime();
                    time = (endTime - startTime) / manyTimes;
                    return time / sec;

                case MIDDLE:

                    startTime = System.nanoTime();
                    for (int i = 0; i < manyTimes; i++) {
                        integers.get((integers.size() - 1) / 2);
                    }
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / manyTimes;
                    return time / sec;

                case LAST:

                    startTime = System.nanoTime();
                    for (int i = 0; i < manyTimes; i++) {
                        integers.get((integers.size() - 1));
                    }
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / manyTimes;
                    return time / sec;

                default:
                    System.out.println("Error! Insert FIRST , MIDDLE or LAST please");
            }
        } else {
            System.out.println("List is empty! Try again later.");
        }

        return time;
    }

    public double set(Insert insert, int element, int manyTimes) {
        double time = 0;
        switch (insert) {

            case FIRST:

                long startTime = System.nanoTime();
                for (int i = 0; i < manyTimes; i++) {
                    integers.set(0, element);
                }
                long endTime = System.nanoTime();
                time = (endTime - startTime) / manyTimes;
                return time / sec;

            case MIDDLE:

                startTime = System.nanoTime();
                for (int i = 0; i < manyTimes; i++) {
                    integers.set((integers.size() - 1) / 2, element);
                }
                endTime = System.nanoTime();
                time = (endTime - startTime) / manyTimes;
                return time / sec;

            case LAST:
                startTime = System.nanoTime();
                for (int i = 0; i < manyTimes; i++) {
                    integers.set((integers.size() - 1), element);
                }
                endTime = System.nanoTime();
                time = (endTime - startTime) / manyTimes;
                return time / sec;

            default:
                System.out.println("Error! Insert: FIRST , MIDDLE or LAST, please");
        }
        return time;
    }

    public double remove(Insert insert, int manyTimes) {
        double time = 0;
        if (!integers.isEmpty()) {
            switch (insert) {

                case FIRST:

                    long startTime = System.nanoTime();
                    for (int i = 0; i < manyTimes; i++) {
                        integers.remove(0);
                    }
                    long endTime = System.nanoTime();
                    time = (endTime - startTime) / manyTimes;
                    return time / sec;

                case MIDDLE:

                    startTime = System.nanoTime();
                    for (int i = 0; i < manyTimes; i++) {
                        integers.remove((integers.size() - 1) / 2);
                    }
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / manyTimes;
                    return time / sec;

                case LAST:

                    startTime = System.nanoTime();
                    for (int i = 0; i < manyTimes; i++) {
                        integers.remove((integers.size() - 1));
                    }
                    endTime = System.nanoTime();
                    time = (endTime - startTime) / manyTimes;
                    return time / sec;

                default:
                    System.out.println("Error! Insert: FIRST , MIDDLE or LAST, please");
            }
        }
        return time;
    }
}
