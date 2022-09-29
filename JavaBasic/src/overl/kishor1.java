package overl;

public class kishor1 {
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number ) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}
	public void square(double number) {
		double square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}
	public static void main(String[] args) {
		kishor1 obj = new kishor1();		
		obj.square(35);
		obj.square(4.5d);
		obj.square(5);
	}
}
