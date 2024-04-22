package Abstract;

public class Triangle extends Shape {

	protected int width;
	protected int height;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = width * height * 0.5;
	}

}