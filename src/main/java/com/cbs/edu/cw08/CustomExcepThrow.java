package com.cbs.edu.cw08;

public class CustomExcepThrow {
    public static void main(String[] args) {
        try {
            f();
        }
        catch (CustomException e) {
            e.printStackTrace();
            System.out.println("It catched! Yeah!");
        }
    }

    public static void f() throws CustomException {
        throw new CustomException("Some exception message");
    }
}
