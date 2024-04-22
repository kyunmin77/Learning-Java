package Abstract;

public class Ractangle extends Shape {

	protected int width;
	protected int height;

	public Ractangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ractangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		
		area = width * height;
	}

}