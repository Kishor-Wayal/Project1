package HomeWork;

// this statement

class A1 {
	A1() {
		this(12.34);
		System.out.println("hello zero");
	}
	A1(double d) {
		this(10);
		System.out.println("hello double "+d);
	}

	A1(int x) {

		System.out.println("Hello int "+x);
	}
}

class Home9 {
	public static void main(String args[]) {
		//A1 a1=new A1();
		//A1 a2=new A1(10.23);
		//A1 a3=new A1(10);
		
		A1 a1=new A1();
	}
}

	