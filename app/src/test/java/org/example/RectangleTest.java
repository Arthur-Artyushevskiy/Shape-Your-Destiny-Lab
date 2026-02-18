package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea(){
        var rectangle = new Rectangle("RectangleBob", 2.98, 5.83);
        assertTrue(rectangle.getArea() - 17.3734 < 0.0001, "Value should be less than " + 0.0001);
    }


    @Test
    void testPerimeter(){
        var rectangle = new Rectangle("RectangleBob", 2.98, 5.83);
        assertTrue(rectangle.getPerimeter() - 17.62 < 0.0001, "Value should be less than " + 0.0001);
    }

}
