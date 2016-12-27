package com.cbs.edu.cw07.enums;

public enum Country {

    USA("United States of America"), UKRAINE("Ukraine"), CANADA("Canada");

    String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
