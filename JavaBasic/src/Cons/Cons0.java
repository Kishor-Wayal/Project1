package Cons;

public class Cons0 {
  int age=25;
  Cons0() {
	  
  }
  void display() {
	  System.out.println("I am display method");
  }
	public static void main(String[] args) {
		Cons0 c1= new Cons0();
		System.out.println(c1.age);
		c1.display();

	}

}
