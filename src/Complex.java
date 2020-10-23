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
        Complex r = new Complex();
        r.real = this.real + c.real;
        r.imaginary = this.imaginary + c.imaginary;
        return r;
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

}
