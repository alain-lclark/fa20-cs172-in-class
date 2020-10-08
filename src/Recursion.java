public class Recursion {

    static int level;

    public static void main(String[] args) {
        level = 0;
        //runFactorials();
        //runFibonaccis();
        //factorialTrace(4);
        //fibonacciTrace(8);
        StdOut.printf("fibonacci(50)= %d\n", fibonacci(50));
    }

    public static void runFactorials() {
        Stopwatch timer = new Stopwatch();
        factorial(1);
        double time1 = timer.elapsedTime();
        factorial(5);
        double time5 = timer.elapsedTime();
        factorial(10);
        double time10 = timer.elapsedTime();
        factorial(50);
        double time50 = timer.elapsedTime();
        StdOut.printf("factorial(1) took %.2f seconds\n", time1);
        StdOut.printf("factorial(5) took %.2f seconds\n", time5 - time1);
        StdOut.printf("factorial(10) took %.2f seconds\n", time10 - time5);
        StdOut.printf("factorial(50) took %.2f seconds\n", time50 - time10);
    }

    public static void runFibonaccis() {
        Stopwatch timer = new Stopwatch();
        fibonacci(1);
        double time1 = timer.elapsedTime();
        fibonacci(5);
        double time5 = timer.elapsedTime();
        fibonacci(10);
        double time10 = timer.elapsedTime();
        fibonacci(50);
        double time50 = timer.elapsedTime();
        StdOut.printf("fibonacci(1) took %.2f seconds\n", time1);
        StdOut.printf("fibonacci(5) took %.2f seconds\n", time5 - time1);
        StdOut.printf("fibonacci(10) took %.2f seconds\n", time10 - time5);
        StdOut.printf("fibonacci(50) took %.2f seconds\n", time50 - time10);
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        return n*factorial(n - 1);
    }

    private static long[] f = new long[92];

    public static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (f[(int)n] > 0) return f[(int)n];
        f[(int)n] = fibonacci(n - 1) + fibonacci(n - 2);
        return f[(int)n];
    }

    public static long factorialTrace(long n) {
        StdOut.println(indent(level) + "factorial(" + n + ")");
        if (n == 0) {
            StdOut.println(indent(level) + "return 1");
            return 1;
        }
        ++level;
        long v = n*factorialTrace(n - 1);
        --level;
        StdOut.println(indent(level) + "return " + v);
        return v;
    }

    public static long fibonacciTrace(long n) {
        StdOut.println(indent(level) + "fibonacci(" + n + ")");
        if (n == 0) {
            StdOut.println(indent(level) + "return 0");
            return 0;
        }
        if (n == 1) {
            StdOut.println(indent(level) + "return 1");
            return 1;
        }
        ++level;
        long v = fibonacciTrace(n - 1) + fibonacciTrace(n - 2);
        --level;
        StdOut.println(indent(level) + "return " + v);
        return v;
    }

    public static String indent(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2*n; ++i) sb.append(" ");
        return sb.toString();
    }

}
