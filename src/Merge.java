public class Merge {

    /**
     * Return true if the numbers in the range [i, j] inclusive are sorted.
     * @param a  an array of numbers
     * @param i  beginning of the range
     * @param j  end of the range
     * @return true if a[i] <= a[i+1] <= ... <= a[j]
     */
    public static boolean sorted(Comparable[] a, int i, int j) {
        for (; i < j; ++i)
            if (a[i].compareTo(a[i + 1]) > 0) return false;
        return true;
    }

    /**
     * Sort the array of numbers in the range [lo ... hi).
     * @param a  the array to be sorted
     * @param aux  temporary storage
     * @param lo  low bound (inclusive)
     * @param hi  high bound (exclusive)
     */
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi - lo <= 1) return; // base case
        // Compute the mid-point
        int mid = lo + (hi - lo)/2;
        // Sort the two halves
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        // Merge
        int l = lo;  // left "red" arrow
        int r = mid; // right "red" arrow
        for (int k = lo; k < hi; ++k) {
            if      (l == mid)                 aux[k] = a[r++];
            else if (r == hi)                  aux[k] = a[l++];
            else if (a[r].compareTo(a[l]) < 0) aux[k] = a[r++];
            else                               aux[k] = a[l++];
        }
        for (int k = 0; k < hi; ++k) {
            a[k] = aux[k];
        }
    }

    /**
     * Sort the array of number using the insertion sort algorithm.
     * @param a  the array to be sorted
     */
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length);
    }

    private static double runTrial(int n) {
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; ++i)
            a[i] = StdRandom.uniform(2000000) - 1000000;
        Stopwatch timer = new Stopwatch();
        sort(a);
        return timer.elapsedTime();
    }

    public static void main(String[] unused) {
        int n = 512;
        double previous = runTrial(n / 2);
        StdOut.printf("        n ratio\n");
        for (; true; n *= 2) {
            double current = runTrial(n);
            double ratio = current / previous;
            StdOut.printf("%9d %4.2f\n", n, ratio);
            previous = current;
        }
    }

}
