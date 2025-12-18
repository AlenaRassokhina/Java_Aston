import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AreaOfATriangleTest {

    private AreaOfATriangle triangle;

    @BeforeMethod
    public void setUp() {
        triangle = new AreaOfATriangle();
    }

    @Test(description = "Расчет площади треугольника с целочисленными значениями", priority = 1)
    public void testTriangleInteger() {

        double a = 12;
        double b = 13;
        double c = 22;

        double resalt = triangle.HeronsFormula(a, b, c);
        System.out.println("Периметр треугольника равен " + resalt);
        assertEquals(triangle.HeronsFormula(12, 13, 22), resalt, "Периметр треугольника должен быть равен " + resalt);
    }

    @Test(description = "Расчет площади треугольника с плавающей запятой", priority = 2)
    public void testTriangleNonInteger() {

        double a = 2.2;
        double b = 3.5;
        double c = 2.6;

        double resalt = triangle.HeronsFormula(a, b, c);
        System.out.println("Периметр треугольника равен " + resalt);
        assertEquals(triangle.HeronsFormula(2.2, 3.5, 2.6), resalt, "Периметр треугольника должен быть равен " + resalt);
    }
}