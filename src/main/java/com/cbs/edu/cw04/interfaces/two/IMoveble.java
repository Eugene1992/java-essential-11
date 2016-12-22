package com.cbs.edu.cw04.interfaces.two;

public interface IMoveble extends SuperMoveable{

    int calcDistance(int hours);

    default void d() {
//        sm();
    }

    static void s() {

    }
}
