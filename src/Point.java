public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
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
    }

}
