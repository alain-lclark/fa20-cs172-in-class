public class Harmonic {

    public static void main(String[] unused) {
        StdOut.printf("H(1) = %f\n", harmonic(1));
        StdOut.printf("H(2) = %f\n", harmonic(2));
        StdOut.printf("H(5) = %f\n", harmonic(5));
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

}
