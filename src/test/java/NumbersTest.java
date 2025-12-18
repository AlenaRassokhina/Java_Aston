import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    @DisplayName("Сравнение аргументов")
    public void  testArgumentsEqual() {

        int a = 13;
        int b = 13;

        Assertions.assertSame(a, b, "Аргументы не равны");
        System.out.println("Аргументы равны: " + a + " = " + b);
    }
}