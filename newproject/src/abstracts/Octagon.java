package abstracts;

public class Octagon extends GeometricObject{
	protected double n;

	public Octagon() {
		this(5);
	}

	public Octagon(double n) {
		this.n = n;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8 * n;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2 + 4 / 12) * n * n;
	}

}
