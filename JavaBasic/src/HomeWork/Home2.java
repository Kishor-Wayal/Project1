package HomeWork;

public class Home2 {
	double x=10,y=20,z=30;
	boolean checkSameOrNot(int a,int b) {
		boolean res=(a==b);
		return res;
	}
static void display() {
	Home2 h2= new Home2();
	System.out.println("first number:"+h2.x);
	System.out.println("second number:"+h2.y);
	System.out.println("third number:"+h2.z);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home2 h1 = new Home2();
		System.out.println("first number:"+h1.x);
		System.out.println("second number:"+h1.y);
		System.out.println("third number:"+h1.z);
		h1.average(10,20,30);
		boolean res= h1.checkSameOrNot(10,10);
		System.out.println("Is both naumber same:"+res);
		display();
	}
	public void average(double p,double q,double r)
	{
		double res=(p+q+r)/3;
		System.out.println("The average value is:"+res);
	}

}
