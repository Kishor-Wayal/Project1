package Assignment;

public class Tst2 {

			// Global Variable ---> Static and non-static global variable
			static int num=32;
			double salary;
			int age=30;
			
			
			
			// blocks---> static and non-static block
			static {
				System.out.println("static blocks");
			}
			{
				salary=3400.43;
				System.out.println("nonstatic blocka");
			}
			
			// method or function ---> can have static or non-static method with local variables
			public static void printl1() {
				System.out.println("The value of num:"+num);
			}
			public void call() {
				System.out.println("The value of age:"+age);
			}
			
			//method overloading
			public void call(int a ) {
				this.call();
				System.out.println("value of a:"+a);
				System.out.println("salary of value:"+salary);
			}
						//constructor
			Tst2(int roll) {
				System.out.println("display:"+roll);
			}
			
			void display() {
				System.out.println("Hi am display method");
			
			}

			//constructor overloading
			
			Tst2(double fee){
				this(34);
				System.out.println("display:"+fee);
				
			}
			
			
			//this keyword & this() statement
			
			
	
			
			
			
             
			public static void main(String[] args) {
				//local variable
			Tst2 obj = new Tst2(66);
			printl1();
			obj.call();
			obj.call(45);
			obj.display();
		    
			}
}


