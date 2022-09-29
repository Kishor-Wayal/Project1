package Encapsulation;
class EncapsulationDemo{
	private int ssn;
	private int empAge;
	public int getssn() {
		return ssn;
	}
	public void setssn(int ssn) {
		this.ssn=ssn;
	}
	public int getempAge() {
		return empAge;
	}
	public void setempAge(int emAge) {
		this.empAge=emAge;
	}
}

public class Encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println("Employee ssn"+obj.getssn());
		System.out.println("Employee Age"+obj.getempAge());
		obj.setempAge(40);
	    obj.setssn(2345);
	    System.out.println("Employee ssn"+obj.getssn());
		System.out.println("Employee Age"+obj.getempAge());
}}
