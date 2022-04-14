package javacorn;

public class Fan1 {

	public class Fan {
		final int SLOW = 1; // Fan speed slow
		final int MEDIUM = 2; // Fan speed medium
		final int FAST = 3; // Fan speed fast
		// A private int data field named speed that specifies the speed of the fan (the
		// default is SLOW)
		public int speed = SLOW;
		// A private boolean data field named on that specifies whether the fan is on
		// (the default is false).
		public boolean on = false;
		// A private double data field named radius that specifies the radius of the fan
		// (the default is 5).
		public double radius = 5;
		// A string data field named color that specifies the color of the fan (the
		// default is blue)
		public String color = "blue";

		// Constructor
		public Fan() {

		}

		// Accessors and mutators
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public boolean isOn() {
			return on;
		}

		public void setOn(boolean on) {
			this.on = on;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		// Optional validate
		
		// A method named toString() that returns a string description for the fan
		public String toString() {
			if(this.isOn()) {
				return "Speed: "+this.getSpeed()+", Color: "+this.getColor()+", Radius: "+this.getRadius();
			}else {
				return "The fan is off";
			}
		}
	}

}
