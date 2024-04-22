package Abstract;

public class Circle extends Shape {

	protected int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub

		area = Math.PI * radius * radius;
	}

}
