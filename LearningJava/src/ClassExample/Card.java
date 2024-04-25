package ClassExample;

final class Card { //classEx1
	String kind;
	int num;
	public Card() {
		this("SPADE", 1);
	}
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}
	public String toString() {
		return kind + ":" + num;
	}
	
}