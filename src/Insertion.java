public class Insertion {

    /**
     * Return true if the numbers in the range [i, j] inclusive are sorted.
     * @param a  an array of numbers
     * @param i  beginning of the range
     * @param j  end of the range
     * @return true if a[i] <= a[i+1] <= ... <= a[j]
     */
    public static boolean sorted(int[] a, int i, int j) {
        for (; i < j; ++i)
            if (a[i] > a[i + 1]) return false;
        return true;
    }

    /**
     * Sort the array of number using the insertion sort algorithm.
     * @param a  the array to be sorted
     */
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            // pre condition: a[0 ... i - 1] is sorted
            assert sorted(a, 0, i - 1);
            // insert a[i] in a[0 ...  i - 1] in the correct spot
            for (int j = i; j > 0; --j) {
                if (a[j - 1] > a[j]) {
                    // swap a[j - 1] and a[j]
                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                }
                else {
                    break;
                }
            }
            // post condition: a[0 ... i] is sorted
            assert sorted(a, 0, i   );
        }
    }

    private static double runTrial(int n) {
        int[] a = new int[n];
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
