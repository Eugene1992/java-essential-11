package com.cbs.edu.cw_10.strategy;

public class Encryptor {

    private Algorythm algorythm;

    public Encryptor() {
    }

    public void setAlgorythm(Algorythm algorythm) {
        this.algorythm = algorythm;
    }

    public String encryptText(String text) {
        return algorythm.encrypt(text);
    }
}
