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

    public void nudgeX() {
        this.x += 1;
    }

    public void nudgeY() {
        this.y += 1;
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
    }

}
