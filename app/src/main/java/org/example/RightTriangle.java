package org.example;

public class RightTriangle extends Shape{
    double base;
    double height;

    RightTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return (0.5 * base * height) ;
    }

    @Override
    double getPerimeter() {
        return base + height + getHypothenus();
    }


    double getHypothenus(){
        return Math.pow(Math.pow(base, 2) + Math.pow(height, 2), 0.5);
    }
}
