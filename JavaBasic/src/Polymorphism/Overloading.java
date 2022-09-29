package Polymorphism;
class Shape{
	public void area() {
		System.out.println("find area");
	}
	public void area(int r) {
		System.out.println("circle area="+3.14*r*r);
	}
	public void area(double b,double h) {
		System.out.println("Triangle area="+0.5*b*h);
	}
	public void area(int l,int b) {
		System.out.println("rectangle area="+l*b);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape s1= new Shape();
     s1.area();
     s1.area(5);
     s1.area(9.0, 1.3);
     s1.area(6, 3);
	}

}
