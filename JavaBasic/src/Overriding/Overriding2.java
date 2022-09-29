package Overriding;
class Human{
	public void eat() {
		System.out.println("Human is eating");
	}
}
class boy extends Human{
	public void eat() {
		System.out.println("boy is eating");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boy obj = new boy();
obj.eat();
boy obj2 = new boy();
obj2.eat();
	}

}
