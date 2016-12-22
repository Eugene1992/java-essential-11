package com.cbs.edu.cw04.abstract_class;

public class Circle extends RoundShape {

    public Circle(int a) {
        super(a);
    }

    @Override
    public double getCircumferenceLength() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
