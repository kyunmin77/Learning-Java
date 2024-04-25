package ClassExample;

public class ClassEx1 {

	public static void main(String[] args) throws Exception {
		Card c = new Card("Heart",3);
		Card c2 = Card.class.newInstance();

		Class cobj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cobj.getName());
		System.out.println(cobj.toGenericString());
		System.out.println(cobj.toString());
	}

}