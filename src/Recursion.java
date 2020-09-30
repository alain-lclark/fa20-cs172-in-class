public class Recursion {

    public static void main(String[] unused) {
        StdOut.println("Factorial of 1 is " + factorial(1));
        StdOut.println("Factorial of 5 is " + factorial(5));
        StdOut.println("Factorial of 10 is " + factorial(10));
        StdOut.println("Fibonacci of 1 is " + fibonacci(1));
        StdOut.println("Fibonacci of 5 is " + fibonacci(5));
        StdOut.println("Fibonacci of 10 is " + fibonacci(10));
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        return factorial(n - 1)*n;
    }

    public static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
