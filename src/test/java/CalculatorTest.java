import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(description = "Арифметическое действие: сложение", priority = 1)
    public void testSum() {

        double a = 12;
        double b = 13;

        double resaltSum = calculator.Sum(a, b);
        System.out.println("Сумма равна " + resaltSum);
        assertEquals(calculator.Sum(12, 13), resaltSum, "Сумма должна быть равна " + resaltSum);
    }

    @Test(description = "Арифметическое действие: вычитание", priority = 2)
    public void testSubtraction() {

        double a = 12;
        double b = 13;

        double resaltSubtraction = calculator.Subtraction(a, b);
        System.out.println("Вычитание равно " + resaltSubtraction);
        assertEquals(calculator.Subtraction(12, 13), resaltSubtraction, "Вычитание должно быть равно " + resaltSubtraction);
    }

    @Test(description = "Арифметическое действие: деление", priority = 3)
    public void testDivision() {

        double a = 12;
        double b = 13;

        double resaltDivision = calculator.Division(a, b);
        System.out.println("Деление равно " + resaltDivision);
        assertEquals(calculator.Division(12, 13), resaltDivision, "Деление должно быть равно " + resaltDivision);
    }

    @Test(description = "Арифметическое действие: умножение", priority = 4)
    public void testMultiplication() {

        double a = 12;
        double b = 13;

        double resaltMultiplication = calculator.Multiplication(a, b);
        System.out.println("Умножение равно " + resaltMultiplication);
        assertEquals(calculator.Multiplication(12, 13), resaltMultiplication, "Умножение должно быть равно " + resaltMultiplication);
    }
}