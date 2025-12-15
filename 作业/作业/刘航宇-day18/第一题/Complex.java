public class Complex {
    public int real;
    public int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex sub(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // 输出形如 8+6i 或 8-6i
    @Override
    public String toString() {
        String sign = imag >= 0 ? "+" : "-";
        int absImag = Math.abs(imag);
        return real + sign + absImag + "i";
    }
}