package com.cbs.edu.cw_10.strategy;

import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String text = "Hello world";

        String choice = new Scanner(System.in).next();

        Encryptor encryptor = new Encryptor();

        switch (choice){
            case "CESAR":
                encryptor.setAlgorythm(new Algorythm() {
                    @Override
                    public String encrypt(String text) {
                        byte[] bytes = text.getBytes();
                        for (byte aByte : bytes) {
                            aByte += 3;
                        }
                        return String.valueOf(bytes);
                    }
                });
                break;

            case "HASH":
                encryptor.setAlgorythm(new Algorythm() {
                    @Override
                    public String encrypt(String text) {
                        return Integer.toHexString(text.hashCode());
                    }
                });
                break;
        }

        encryptor.setAlgorythm(new Algorythm() {
            @Override
            public String encrypt(String text) {
                return null;
            }
        });

    }
}
