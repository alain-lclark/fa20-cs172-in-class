public class BinarySearch {

    /**
     * Search for key in the sorted array.
     * @param key  key to search
     * @param a  array of sorted elements
     * @return if found, index of the key in the array, -1 otherwise
     */
    public static int search(Comparable key, Comparable[] a) {
        return search(key, a, 0, a.length);
    }

    /**
     * Search for key in the range [lo ... hi) in the sorted array.
     * @param key  key to search
     * @param a  array of sorted elements
     * @param lo  if the key is anywhere, it's larger or equal to lo
     * @param hi  if the key is anywhere, it's smaller than hi
     * @return if found, index of the key in the array, -1 otherwise
     */
    private static int search(Comparable key, Comparable[] a, int lo, int hi) {
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo)/2;
        int cmp = a[mid].compareTo(key);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid + 1, hi);
        else              return mid;
    }

    private static double runTrial(int n) {
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; ++i)
            a[i] = StdRandom.uniform(2000000) - 1000000;
        Merge.sort(a);
        Integer[] ks = new Integer[10000];
        for (int i = 0; i < ks.length; ++i)
            ks[i] = StdRandom.uniform(2000000) - 1000000;
        Stopwatch timer = new Stopwatch();
        for (int i = 0; i < ks.length; ++i)
            search(ks[i], a);
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
