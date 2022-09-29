package Encapsulation;
class Encap{
	private int pinCode=431203;
	private double salary=90000;
	private char grade='A';
	public int getpinCode() {
		return pinCode;
	}
	public double getsalary() {
		return salary;
	}
	public char getgrade() {
		return grade;
	}
	public void setpinCode(int pin) {
		pinCode=pin;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setgrade(char grade) {
	this.	grade=grade;
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Encap e1=new Encap();
     System.out.println(e1.getpinCode());
     System.out.println(e1.getsalary());
     System.out.println(e1.getgrade());
     e1.setpinCode(1234);
     System.out.println(e1.getsalary());
     e1.setsalary(90000);
     System.out.println(e1.getgrade());
     System.out.println(e1.getpinCode());
      
	}

}
