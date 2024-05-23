package pkg1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg1.Factorial;

public class TestFactorial {
    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        System.out.println("Test case started.");
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfZero() {
        int result = factorial.calculate(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfOne() {
        int result = factorial.calculate(1);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        int result = factorial.calculate(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.calculate(-5);
        });
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test case ended.");
    }
}
