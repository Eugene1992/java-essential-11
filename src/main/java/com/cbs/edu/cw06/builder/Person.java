package com.cbs.edu.cw06.builder;

public class Person {

    private String firstName; // required
    private String lastName;  // required
    private int age;
    private String education;
    private String nationality;
    private boolean isMarried;

    public Person(String firstName, String lastName, int age, String education) {
        this(firstName, lastName, age, education, null, false);
    }

    public Person(String firstName, String lastName, int age, String education, String nationality) {
        this(firstName, lastName, age, education, nationality, false);
    }

    public Person(String firstName, String lastName, int age, String education, String nationality, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.nationality = nationality;
        this.isMarried = isMarried;
    }
}
