import org.junit.jupiter.api.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class MyTest {

        @Test
        @DisplayName("Арифметическое действие: сложение")
        @Order(1)
        public void testSum() {

            double a = 12;
            double b = 13;

            double resaltSum = calculator.Sum(a, b);
            System.out.println(resaltSum);
            Assertions.assertEquals(25, resaltSum, "Сумма должна быть равна 25");
        }

        @Test
        @DisplayName("Арифметическое действие: вычитание")
        @Order(2)
        public void testSubtraction() {

            double a = 12;
            double b = 13;

            double resaltSubtraction = calculator.Subtraction(a, b);
            System.out.println(resaltSubtraction);
            Assertions.assertEquals(-1, resaltSubtraction, "Вычитание равно -1");
        }

        @Test
        @DisplayName("Арифметическое действие: деление")
        @Order(3)
        public void testDivision() {

            double a = 12;
            double b = 13;

            double resaltDivision = calculator.Division(a, b);
            System.out.println(resaltDivision);
            Assertions.assertEquals(0.9230769230769231, resaltDivision, "Деление равно 0.9230769230769231");
        }

        @Test
        @DisplayName("Арифметическое действие: умножение")
        @Order(4)
        public void testMultiplication() {

            double a = 12;
            double b = 13;

            double resaltMultiplication = calculator.Multiplication(a, b);
            System.out.println(resaltMultiplication);
            Assertions.assertEquals(156, resaltMultiplication, "Умножение равно 156");
        }
    }
}