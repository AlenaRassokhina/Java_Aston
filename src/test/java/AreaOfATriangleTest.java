import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfATriangleTest {

    AreaOfATriangle triangle = new AreaOfATriangle();

    @Test
    @DisplayName("Расчет площади треугольника с целочисленными значениями")
    public void testTriangleInteger() {

        double a = 12;
        double b = 13;
        double c = 22;

        double resalt = triangle.HeronsFormula(a, b, c);
        System.out.println(resalt);
        Assertions.assertEquals(65.2413787407961, resalt, "Периметр треугольника равен 65.2413787407961");
    }

    @Test
    @DisplayName("Расчет площади треугольника с плавающей запятой")
    public void testTriangleNonInteger() {

        double a = 2.2;
        double b = 3.5;
        double c = 2.6;

        double resalt = triangle.HeronsFormula(a, b, c);
        System.out.println(resalt);
        Assertions.assertEquals(2.8553797908509484, resalt, "Периметр треугольника равен 2.8553797908509484");
    }
}