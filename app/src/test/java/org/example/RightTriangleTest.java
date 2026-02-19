package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    @Test
    void testArea(){
        var rightTriangle = new RightTriangle("RectangleBob", 2.98, 5.83);

        assertTrue(rightTriangle.getArea() - 8.6867 < 0.001, "Value should be less than " + 0.001);

    }

    @Test
    void testPerimeter(){
        var rightTriangle = new RightTriangle("RectangleBob", 2.98, 5.83);

        assertTrue(rightTriangle.getPerimeter() - 15.35747 < 0.0001, "Value should be less than " + 0.0001);

    }

    @Test
    void testNumnberOfSides(){
        var rightTriangle = new RightTriangle("RectangleBob", 2.98, 5.83);
        assertEquals(3, rightTriangle.numberOfSides());
    }
}
