public class Selection {

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
     * Sort the array of number using the selection sort algorithm.
     * @param a  the array to be sorted
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            // pre condition: a[0 ... i] is sorted
            assert sorted(a, 0, i);
            // search minimum in a[i ... ]
            // assume a[i] is minimum in a[i ...] ...
            int min = i;
            // ... until proven otherwise
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j].compareTo(a[min]) < 0) min = j;
            }
            // a[min] = minimum in a[i ...]
            // swap a[min] and a[i]
            Comparable x = a[i];
            a[i] = a[min];
            a[min] = x;
            // post condition: a[0 ... i + 1] is sorted
            assert sorted(a, 0, i + 1);
        }
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
