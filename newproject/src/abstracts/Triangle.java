package abstracts;

public class Triangle extends GeometricObject{
	private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public String toString() {
        return "Cạnh 1 =" + side1 +", Cạnh 2 =" + side2 +", Cạnh 3 =" + side3;
    }
   
    public double getArea() {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    

}
