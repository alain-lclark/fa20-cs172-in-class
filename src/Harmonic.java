public class Harmonic {

    public static void main(String[] unused) {
        StdOut.printf("H(1) = %f (recursive implementation)\n", harmonic(1));
        StdOut.printf("H(2) = %f (recursive implementation)\n", harmonic(2));
        StdOut.printf("H(5) = %f (recursive implementation)\n", harmonic(5));
        StdOut.printf("H(1000000) = %f (iterative implementation)\n", harmonic_iterative(1000000));
        StdOut.printf("H(1000000) = %f (recursive implementation)\n", harmonic(1000000));
    }

    /**
     * Compute the harmonic number of n or Hn.
     *
     * Only defined for n >= 1.
     */
    public static double harmonic(int n) {
        // Hn = Hn-1 + 1/n
        if (n == 1) return 1.0;
        return harmonic(n - 1) + 1.0/n;
    }

    public static double harmonic_iterative(int n) {
        // Hn = 1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; ++i) {
            sum += 1.0/i;
        }
        return sum;
    }

}
