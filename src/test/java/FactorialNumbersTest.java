import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialNumbersTest {

    private FactorialNumbers numbers;

    @BeforeMethod
    public void setUp() {
        numbers = new FactorialNumbers();
    }

    @Test(priority = 1)
    public void testFactorialOfZero() {

        long n = 0;

        long resalt = numbers.getFactorial(n);
        System.out.println("Факториал равен " + resalt);
        assertEquals(numbers.getFactorial(0), 1L, "Факториал 0 должен быть " + resalt);
    }

    @Test(priority = 2)
    public void testFactorialOfPositiveNumber() {

        long n = 5;

        long resalt = numbers.getFactorial(n);
        System.out.println("Факториал равен " + resalt);
        assertEquals(numbers.getFactorial(5), 120L, "Факториал 5 должен быть " + resalt);
    }

    @Test(priority = 3)
    public void testFactorialOfTen() {

        long n = 10;

        long resalt = numbers.getFactorial(n);
        System.out.println("Факториал равен " + resalt);
        assertEquals(numbers.getFactorial(10), 3628800L, "Факториал 10 должен быть " + resalt);
    }
}