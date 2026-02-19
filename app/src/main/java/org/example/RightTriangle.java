package org.example;

public class RightTriangle extends Shape implements Polygon{
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

    @Override
    public int numberOfSides(){
        return 3;
    }

    double getHypothenus(){
        return Math.pow(Math.pow(base, 2) + Math.pow(height, 2), 0.5);
    }
}
