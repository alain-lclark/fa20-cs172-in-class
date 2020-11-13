public class Vector implements Comparable<Vector> {

    private final double[] v;

    public Vector(double[] v) {
        // defensive copy
        this.v = new double[v.length];
        for (int i = 0; i < v.length; ++i) {
            this.v[i] = v[i];
        }
    }

    public Vector plus(Vector that) {
        double[] result = new double[v.length];
        for (int i = 0; i < v.length; ++i) {
            result[i] = this.v[i] + that.v[i];
        }
        return new Vector(result);
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < v.length; ++i) {
            s += " " + v[i];
        }
        s += " ]";
        return s;
    }

    /**
     * Lexicographic order on vectors.
     * @param that  object to compare against
     * @return  0 if content of this = content of that,
     *         -1 if content of this < content of that,
     *         +1 otherwise
     */
    @Override
    public int compareTo(Vector that) {
        int len = this.v.length;
        if (that.v.length < len) len = that.v.length;
        for (int i = 0; i < len; ++i) {
            if (this.v[i] < that.v[i]) return -1;
            if (this.v[i] > that.v[i]) return +1;
        }
        if (this.v.length < that.v.length) return -1;
        if (this.v.length > that.v.length) return +1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Vector that = (Vector)o;
        if (this.v.length != that.v.length) return false;
        for (int i = 0; i < this.v.length; ++i)
            if (this.v[i] != that.v[i]) return false;
        return true;
    }

    public static void main(String[] unused) {
        double[] a = { 3.0, 4.0 };
        Vector vector = new Vector(a);
        StdOut.println(vector);
        a[0] = 3.14;
        StdOut.println(vector);
        StdOut.println("a[0] = " + a[0] + " a[1] = " + a[1]);
    }

}
