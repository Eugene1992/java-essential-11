package com.cbs.edu.hw_05;

import static com.cbs.edu.hw_05.TimeStampImpl.Insert;

/**
 * Created by Sviatoslav on 25.12.2016.
 */
public interface ITimeStamp {

    double add(Insert insert, int num);

    double get(Insert insert);

    double set(Insert insert, int num);

    double remove(Insert insert);

}


