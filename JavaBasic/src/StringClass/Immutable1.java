package StringClass;
final class ImmutableClass{
	final String name;
	final int salary;
	ImmutableClass(String s1,int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
}
public class Immutable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass t1=new ImmutableClass("Kishor",23000);
		System.out.println(t1.getName());
		System.out.println(t1.getsalary());
	}

}
