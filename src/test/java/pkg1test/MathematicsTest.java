package pkg1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg1.Mathematics;
import pkg1.TestCaseConstants;

public class MathematicsTest {
    private Mathematics mathematics;

    @BeforeEach
    public void setUp() {
        System.out.println("Test case started.");
        mathematics = new Mathematics();
    }

    @Test
    public void testFactorialOfZero() {
        int result = mathematics.calculateFactorial(TestCaseConstants.FACTORIAL_OF_ZERO);
        assertEquals(TestCaseConstants.EXPECTED_RESULT_ZERO, result);
    }

    @Test
    public void testFactorialOfOne() {
        int result = mathematics.calculateFactorial(TestCaseConstants.FACTORIAL_OF_ONE);
        assertEquals(TestCaseConstants.EXPECTED_RESULT_ONE, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        int result = mathematics.calculateFactorial(TestCaseConstants.FACTORIAL_OF_FIVE);
        assertEquals(TestCaseConstants.EXPECTED_RESULT_FIVE, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathematics.calculateFactorial(TestCaseConstants.NEGATIVE_NUMBER);
        });
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test case ended.");
    }
}
