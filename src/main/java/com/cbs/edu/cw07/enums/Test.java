package com.cbs.edu.cw07.enums;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Role.ADMIN);
//        System.out.println(UserRole.ADMIN);

        Country[] values = Country.values();

        for (Country value : values) {
            System.out.println(value.getName());
        }
    }
}
