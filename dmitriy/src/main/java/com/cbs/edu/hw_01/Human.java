package com.cbs.edu.hw_01;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Human {

    private String name;
    private int growth;
    private int age;

    public Human (String name, int growth, int age){
        this.name = name;
        this.growth = growth;
        this.age = age;
    }

    public String getName (){
        return name;
    }

    public int getGrowth(){
        return growth;
    }

    public int getAge(){
        return age;
    }


}

