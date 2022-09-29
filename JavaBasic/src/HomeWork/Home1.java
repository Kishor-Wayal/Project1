package HomeWork;

public class Home1 {
   int age;
   public void display() {
	   System.out.println("I am display method of value:"+age);
   }
   public void display(int a) {
	   age=a;
	   System.out.println("I am display int of value:"+age);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Home1 h2= new Home1();
    System.out.println("age:"+h2.age);
    h2.display();
    h2.display(23);
   Home1 h3 = new Home1();
   h3.display(75);
   h3.display(34);
	}

}
