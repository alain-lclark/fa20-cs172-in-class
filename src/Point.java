public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void nudgeX(int amount) {
        this.x += amount;
    }

    public void nudgeX() {
        this.nudgeX(1);
    }

    public void nudgeY(int amount) {
        this.y += amount;
    }

    public void nudgeY() {
        this.nudgeY(1);
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Point q = (Point)o;
        if (this.x == q.x && this.y == q.y) return true;
        return false;
    }

    /**
     * Small test of basic functionality.
     * @param unused  unused command-line arguments
     */
    public static void main(String[] unused) {
        Point p = new Point(1, 11);
        StdOut.println(p);
        Point zero = new Point();
        StdOut.println(zero);
        p.nudgeX();
        p.nudgeY();
        StdOut.println(p);
        p.nudgeX(-5);
        StdOut.println(p);
    }

}
