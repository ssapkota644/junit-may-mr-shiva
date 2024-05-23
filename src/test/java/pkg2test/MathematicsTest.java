package pkg2test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pkg2.Mathematics;
import pkg2.MochaService;
import pkg2.TestCaseConstants;

@ExtendWith(MockitoExtension.class)
public class MathematicsTest {
    @Mock
    private MochaService mochaService;

    @InjectMocks
    private Mathematics mathematics;

    @BeforeEach
    public void setUp() {
        System.out.println("Test case started.");
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
        when(mochaService.multiply(anyInt(), eq(2))).thenReturn(2);
        when(mochaService.multiply(anyInt(), eq(3))).thenReturn(6);
        when(mochaService.multiply(anyInt(), eq(4))).thenReturn(24);
        when(mochaService.multiply(anyInt(), eq(5))).thenReturn(120);

        int result = mathematics.calculateFactorial(TestCaseConstants.FACTORIAL_OF_FIVE);
        assertEquals(TestCaseConstants.EXPECTED_RESULT_FIVE, result);

        verify(mochaService).multiply(1, 2);
        verify(mochaService).multiply(2, 3);
        verify(mochaService).multiply(6, 4);
        verify(mochaService).multiply(24, 5);
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
