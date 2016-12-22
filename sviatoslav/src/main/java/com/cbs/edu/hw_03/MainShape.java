package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class MainShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape parallelogram = new Parallelogram();
        Shape rhombus = new Rhombus();
        Shape trapezoid = new Trapezoid(12);

        calculate(rectangle, triangle, square, parallelogram, rhombus, trapezoid);
    }
    public static void calculate(Shape... shapes){
        for (Shape shape : shapes) {
            System.out.println("Area is : " + shape.getArea());
        }
    }
}
