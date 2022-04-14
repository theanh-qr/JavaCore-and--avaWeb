package abstracts;

public class Complex {
	private double a, b;

	public Complex() {
		this.a = 0;
		this.b = 0;
	}

	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getRealPart() {
		return this.a;
	}

	public double getImaginaryPart() {
		return this.b;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Complex add(Complex secondComplex) {
		double realPart = this.a + secondComplex.getA();
		double ImaginaryPart = this.b + secondComplex.getB();
		return new Complex(realPart, ImaginaryPart);
	}

	public Complex subtract(Complex secondComplex) {
		double realPart = this.a - secondComplex.getA();
		double ImaginaryPart = this.b - secondComplex.getB();
		return new Complex(realPart, ImaginaryPart);
	}

	public Complex multiply(Complex secondComplex) {
		double realPart = this.a * secondComplex.getA() - this.b * secondComplex.getB();
		double ImaginaryPart = secondComplex.getA() * this.b + this.a * secondComplex.getB();
		return new Complex(realPart, ImaginaryPart);
	}

	public Complex divide(Complex secondComplex) {
		double a = this.a, b = this.b, c = secondComplex.getA(), d = secondComplex.getB();
		double realPart = (a * c + b * d) / (c * c + d * d);
		double imaginaryPart = (b * c - a * d) / (c * c + d * d);
		return new Complex(realPart, imaginaryPart);
	}

	public double abs() {
		return Math.sqrt(this.a * this.a + this.b * this.b);
	}

	public String toString() {
		return getRealPart() + " + " + getImaginaryPart() + "i";
	}
}
