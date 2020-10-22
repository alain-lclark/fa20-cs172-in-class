public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
    }

}
