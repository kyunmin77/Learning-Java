package Example;

class MyMathTest {
	public static void main(String[] args) {
	
	MyMath mm = new MyMath();
	long result1 = mm.add(5L, 3L);
	long result2 = mm.subtract(5L, 3L);
	long result3 = mm.multiply(5L, 3L);
	double result4 = mm.devide(5L, 3L); 
	
	System.out.println("add(5L, 3L) = " +result1);
	System.out.println("subtract(5L, 3L) = " +result2);
	System.out.println("mutiply(5L, 3L) = " +result3);
	System.out.println("devide(5L, 3L) = " +result4);
	}
}