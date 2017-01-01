package com.cbs.edu.hw_05;

import static com.cbs.edu.hw_05.TimeStampImpl.Insert;

/**
 * Created by Sviatoslav on 25.12.2016.
 */
public interface ITimeStamp {

    double add(Insert insert, int element, int cycle);

    double get(Insert insert, int cycle);

    double set(Insert insert, int element, int cycle);

    double remove(Insert insert, int cycle);

}


