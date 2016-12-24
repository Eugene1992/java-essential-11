package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class MainShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 4, "Rectangle");
        Shape triangle = new Triangle(2,3, "Triangle");
        Shape square = new Square(4, "Square");
        Shape parallelogram = new Parallelogram(4,5, "Parallelogram");
        Shape rhombus = new Rhombus(6,2, "Rhombus");
        Shape trapezoid = new Trapezoid(3,6,9, "Trapezoid");

        calculate(rectangle, triangle, square, parallelogram, rhombus, trapezoid);
    }
    public static void calculate(Shape... shapes){
        for (Shape shape : shapes) {
            System.out.println(shape.getName() +  " area is : " + shape.getArea());
        }
    }
}
