import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumbersTest {

    @Test(description = "Сравнение аргументов на равенство")
    public void testArgumentsEqual() {

        int a = 13;
        int b = 13;

        System.out.println("Аргументы равны: " + a + " = " + b);
        assertSame(13, 13, "Аргументы не равны");
    }

    @Test(description = "Сравнение аргументов на неравенство")
    public void testArgumentsInequal() {

        int a = 14;
        int b = 13;

        System.out.println("Аргументы не равны: " + a + " не равно " + b);
        assertNotSame(14, 13, "Аргументы равны");
    }
}
