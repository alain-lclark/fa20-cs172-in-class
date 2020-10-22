public class PointClient {

    public static void main(String[] unused) {
        Point p;
        // Cannot access Point's instance variables because they are
        // marked "private".  It is a common library design decision.
        // Instead, we must rely on whatever instance methods are made
        // available to us (i.e., marked "public").
        // p.x = 10;
        // p.y = -5;
        p = new Point(10, -5);
        StdOut.println(p);
    }

}
