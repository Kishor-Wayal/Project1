package Blocks;

public class Blocks1 {
	Blocks1() {
		System.out.println("zero parameter cons...");
	}
	{
		System.out.println("running non static blocks of class bloack1..");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Start");
Blocks1 b1 = new Blocks1();
System.out.println(b1);
Blocks1 b2 = new Blocks1();
System.out.println(b2);
	}

}
