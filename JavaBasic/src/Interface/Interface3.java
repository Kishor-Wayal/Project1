package Interface;
interface printable{
	int age=90;
	void print();
}
interface Showable{
	public void show();
	
}

public class Interface3 implements printable,Showable {
	public static int age=45;
	public void print() {
		System.out.println("Hello Print");
	}
	public void show() {
		System.out.println("Welcome Show");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Interface3 obj=new Interface3();
     obj.print();
     obj.show();
     System.out.println(printable.age);
     System.out.println(Interface3.age);
		
		
		
	}

}
