package com.cbs.edu.hw_05;

import java.util.List;

/**
 * Created by Sviatoslav on 25.12.2016.
 */
public interface ITimeStamp {
    double addLastToList();

    double addFirstToList(List<Integer> list);

    double addInMiddleToList(List<Integer> list);

    double getMiddleFromList(List<Integer> list);

    double getLastFromList(List<Integer> list);

    double getFirstFromList(List<Integer> list);

    double setFirstToList(List<Integer> list);

    double setInMiddleToList(List<Integer> list);

    double setLastToList(List<Integer> list);

    double removeFirstFromList(List<Integer> list);

    double removeInMiddleFromList(List<Integer> list);

    double removeLastFromList(List<Integer> list);
}


