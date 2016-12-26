package com.cbs.edu.hw_03;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Main {

    public static void count(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.printf("%s  square = %1.2f\n", shape.getName(), shape.getSquare());
        }

    }

    public static void main(String[] args) {
        Shape parallelogram = new Parallelogram(14, 16, "Parallelogram");
        Shape rectangle = new Rectangle(11, 13, "Rectangle");
        Shape romb = new Romb(10, 12, "Romb");
        Shape square = new Square(15, "Square");
        Shape trapezia = new Trapezia(13, 15, 17, "Trapezia");
        Shape triangle = new Triangle(16, 18, "Triangle");

        count(parallelogram, rectangle, romb, square, trapezia, triangle);
    }
}
