package pkg2;

public class Mathematics {
    private MochaService mochaService;

    public Mathematics(MochaService mochaService) {
        this.mochaService = mochaService;
    }

    public int calculateFactorial(int n) {
        return MathUtil.factorial(n, mochaService);
    }
}
