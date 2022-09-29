package MethodOverloading;

public class Kishor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		main(15);
		main(25.5f);
	}
		public static void main(int a) {
		System.out.println("I am main"+a);
	}
public static void main(double b ) {
	System.out.println("I am main:"+b);
}
}
