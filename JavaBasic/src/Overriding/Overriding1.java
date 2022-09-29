package Overriding;
class Animal2{
Animal2()   {
	
}
public void move() {
	System.out.println("Animal can move");
}
void display() {
	System.out.println("I am display() of Animal2 class");
}
}
class dog2 extends Animal2 {
		public void move() {
		System.out.println("dog can walk and run");
		display();
		super.move();
	}
		
	}
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal2 b = new dog2();
b.move();
	}

}
