package pkg2;

public class MathUtil {
    public static int factorial(int n, MochaService mochaService) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        if (n == 0 || n == 1)
            return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = mochaService.multiply(result, i);
        }
        return result;
    }
}
