public class Plot {

    public static void main(String[] unused) {
        double xMin = 0.0001;
        double xMax = 10.0;
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(xMin, xMax*xMax);
        plot(new Linear(), xMin, xMax, 50);
        plot(new Square(), xMin, xMax, 50);
        plot(new Log(), xMin, xMax, 50);
        plot(new Linearlog(), xMin, xMax, 50);
    }

    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a)/n;
        for (int i = 0; i <= n; ++i) {
            y[i] = f.evaluate(a + delta*i);
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }
}
