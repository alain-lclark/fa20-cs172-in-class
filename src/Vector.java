public class Vector {

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

    public static void main(String[] unused) {
        double[] a = { 3.0, 4.0 };
        Vector vector = new Vector(a);
        StdOut.println(vector);
        a[0] = 3.14;
        StdOut.println(vector);
    }

}
