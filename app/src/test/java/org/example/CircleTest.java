package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

@Test
    void testArea(){
    var circle = new Circle("CircleBob", 2.34);
    assertTrue(circle.getArea() - 17.2021 < 0.001, "Value should be less than " + 0.001);

}
@Test
    void testPerimenter(){
    var circle = new Circle("CircleBob", 2.34);
    assertTrue(circle.getPerimeter() - 14.70265 < 0.001, "Value should be less than " + 0.001);
}



}
