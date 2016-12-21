package com.cbs.edu.cw03.inheritance;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Some animal");
        Animal cat = new Cat("Barsik", "Meow");
        Animal dog = new Dog("Rex", "Woof");
        Duck duck = new Duck("Donald", "Quack");

        Animal cow = new Cow("Milka");

        animalSpeak(cat, dog, duck, animal, cow);

    }

    public static void animalSpeak(Animal... animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public static void animalSpeak(Cat[] cats, Dog[] dogs, Duck[] ducks) {

    }

    public static void animalSpeakk(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.speak();
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.speak();
            }
            if (animal instanceof Duck) {
                Duck duck = (Duck) animal;
                duck.speak();
            }
        }
    }
 }
