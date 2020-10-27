public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex add(Complex c) {
        double real = this.real + c.real;
        double imaginary = this.imaginary + c.imaginary;
        return new Complex(real, imaginary);
    }

    public String toString() {
        return "(" + this.real + ", " + this.imaginary + ")";
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Complex c = (Complex)o;
        return this.real == c.real && this.imaginary == c.imaginary;
    }

    public static void main(String[] unused) {
        Complex z = new Complex(0.0, 0.0);
        Complex r = z.add(new Complex(1.0, 1.0));
        StdOut.println(r);
    }

}
