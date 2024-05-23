
package pkg1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg1.Add;

public class TestAdd {
    private Add add;

    @BeforeEach
    public void setUp() {
    	System.out.println("Test case started.");
        add = new Add();
    }

  

    @Test
    public void testAddWhenBothNumberPositive() {
        int result = add.add(5, 6);
        assertEquals(11, result);
    }

    @Test
    public void testAddWhenOneNumberZero() {
        int result = add.add(0, 7);
        assertEquals(7, result);
    }

    @Test
    public void testAddWhenBothNumbersZero() {
        int result = add.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testAddWhenBothNumbersNegative() {
        int result = add.add(-5, -6);
        assertEquals(-11, result);
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Test case ended.");
    }
}
