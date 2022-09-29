package Interface;
interface i1{
	
}
interface Drawable{
	int salary=25000;
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("drwaing Rectangle");
	
}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Interface variable slaray:"+Drawable.salary);
Rectangle r1=new Rectangle();
r1.draw();

	}

}
