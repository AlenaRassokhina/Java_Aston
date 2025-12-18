import org.junit.jupiter.api.*;

public class FactorialNumbersTests {

    FactorialNumbers numbers = new FactorialNumbers();

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class MyTest {

        @Test
        @DisplayName("Расчет факториала со значением 0")
        @Order(1)
        public void testFactorialZero() {
            long a = 0;

            long result = numbers.getFactorial(a);
            Assertions.assertEquals(1, result, "Факториал со значением 0 будет равен 1");
        }

        @Test
        @DisplayName("Расчет факториала со значением 5")
        @Order(2)
        public void testFactorialFive() {
            long a = 5;

            long result = numbers.getFactorial(a);
            Assertions.assertEquals(120, result, "Факториал со значением 5 будет равен 120");
        }

        @Test
        @DisplayName("Расчет факториала со значением 10")
        @Order(3)
        public void testFactorialTen() {
            long a = 10;

            long result = numbers.getFactorial(a);
            Assertions.assertEquals(3628800, result, "Факториал со значением 5 будет равен 3628800");
        }
    }
}
