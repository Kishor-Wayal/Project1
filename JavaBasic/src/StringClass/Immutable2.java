package StringClass;
final class testing{
	final int age;
	final double salary;
	final String Name;
	testing(int a, double b, String c){
		age=a;
		salary=b;
		Name=c;
	}
	public int getage() {
		return age;
	}
	public double getsalary() {
		return salary;
	}
	public String getName() {
		return Name;
	}
	public void display() {
		System.out.println(age);
		System.out.println(salary);
		System.out.println(Name);
	}
}
public class Immutable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testing t1 =new testing(25,34005.34,"jalna");
		t1.display();
	}

}
