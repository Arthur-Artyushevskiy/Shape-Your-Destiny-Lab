package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void testArea(){
        var square = new Square("SquareBob", 2.56);

        assertTrue(square.getArea() - 6.5536 < 0.0001, "Value should be less than " + 0.0001);

    }


    @Test
    void testPerimeter(){
        var square = new Square("SquareBob", 2.56);

        assertTrue(square.getArea() - 10.24 < 0.0001, "Value should be less than " + 0.0001);

    }
}
