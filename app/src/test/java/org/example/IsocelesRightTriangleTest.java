package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IsocelesRightTriangleTest {

    @Test
    void testArea(){
        var isocelesRightTriangle = new IsocelesRightTriangle("IsocelesBob", 2.98);

        assertTrue(isocelesRightTriangle.getArea() - 4.4402 < 0.0001, "Value should be less than " + 0.0001);

    }

    @Test
    void testPerimeter(){
        var isocelesRightTriangle = new IsocelesRightTriangle("IsocelesBob", 2.98);

        assertTrue(isocelesRightTriangle.getPerimeter() - 10.17436 < 0.0001, "Value should be less than " + 0.0001);

    }


    @Test
    void testNumberOfSides(){
        var isocelesRightTriangle = new IsocelesRightTriangle("IsocelesBob", 2.98);

       assertEquals(3, isocelesRightTriangle.numberOfSides());

    }
}
