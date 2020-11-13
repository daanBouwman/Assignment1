import nl.saxion.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle1 = new Triangle(7, 10, 5);
    Triangle triangle2 = new Triangle(7, 10, 10);
    Triangle triangle3 = new Triangle(10, 10, 10);
    Triangle triangle4 = new Triangle(8, 10, 23);

    @Test public void testInvalid(){
        String result = triangle4.getType();
        assertEquals("Invalid", result);
    }

    @Test public void testEquilateral(){
        String result = triangle3.getType();
        assertEquals("Equilateral", result);
    }
    @Test public void testIsosceles(){
        String result = triangle2.getType();
        assertEquals("Isosceles", result);
    }
    @Test public void testScalene(){
        String result = triangle1.getType();
        assertEquals("Scalene", result);
    }


}
