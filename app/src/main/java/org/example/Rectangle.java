package org.example;

public class Rectangle extends Shape implements Polygon {
    double width;
    double length;

    Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public int numberOfSides(){
        return 4;
    }
}
