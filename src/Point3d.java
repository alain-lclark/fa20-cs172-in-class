public class Point3d extends Point {

    private int z;

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Point3d that = (Point3d)o;
        return super.equals(that) && this.z == that.z;
    }

    public static void main(String[] unused) {
        Point3d p = new Point3d(1, 3, -5);
        StdOut.println("x = " + p.getX());
        StdOut.println("x = " + p.getY());
        StdOut.println("z = " + p.getZ());
        StdOut.println(p.equals(new Point3d(1, 3, -5)));
        StdOut.println(p.equals(new Point3d(1, 3, 13)));
    }

}
