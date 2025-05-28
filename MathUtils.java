public class MathUtils {

    // Returns the factorial of a number (n!)
    public long factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    long result = 0;  // <-- Mistake introduced here
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

    // Returns the nth Fibonacci number
    public int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        int fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    // Returns the greatest common divisor (GCD) of two numbers using Euclid's algorithm
    public int gcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Returns the square root of a number (rounded to 4 decimal places)
    public double sqrt(double x) {
        if (x < 0) throw new IllegalArgumentException("Negative number");
        return Math.round(Math.sqrt(x) * 10000.0) / 10000.0;
    }

    // Returns the power of base raised to exponent (base^exponent)
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

}//a comment