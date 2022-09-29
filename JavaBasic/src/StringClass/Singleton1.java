package StringClass;
class demo{
	int age=25;
	private demo() {
		System.out.println("demo class cons");
	}
	public static demo d1= new demo();
	public static demo getSamplton() {
		return d1;
	}
	public void display(int num) {
		System.out.println("i am display()");
		age=num;
	}
	
}
public class Singleton1 {

	public static void main(String[] args) {
		//demo d1=new demo();
		demo d1=demo.getSamplton();
		System.out.println(d1.age);
		d1.display(23);
		demo d2=demo.getSamplton();
		System.out.println(d2.age);
	}

}
