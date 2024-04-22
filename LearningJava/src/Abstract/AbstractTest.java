package Abstract;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shape = new Shape[3]; // Shape 인스턴스가 Heap공간에 만들어 졌을때의 주소를 저장할 주소 3개 만듬
		shape[0] = new Circle(5);
		shape[1] = new Ractangle(5, 8);
		shape[2] = new Triangle(10, 15);

		for (int i = 0; i < shape.length; i++) {
			shape[i].calcArea();
			System.out.println("도형의 넓이: " + shape[i].getArea());
		}

	}
}