package com.cbs.edu.cw07.anonymous;

public class Test {
    public static void main(String[] args) {

        String str = "Some String";

        Animal someAnimal = new Animal() {
            @Override
            public void say() {
                System.out.println("Some voice!");
            }
        };

        new Animal() {
            @Override
            public void say() {
                System.out.println("Some voice!");
            }
        }.say();

        someAnimal.say();

        Cat cat = new Cat();
        cat.say();

        Cat homeCat = new Cat(){
            @Override
            public void say() {
                System.out.println("Home cat voice!");
            }
        };
        homeCat.say();

        String content = "Hello world!";
        print(new IPrinterFormat() {
            @Override
            public void print(String text) {
                System.out.println(text.toUpperCase());
            }
        }, content);

        print(new IPrinterFormat() {
            @Override
            public void print(String text) {
                System.out.println(text.toLowerCase());
            }
        }, content);
    }

    public static void print(IPrinterFormat pf, String text) {
        pf.print(text);
    }
}
