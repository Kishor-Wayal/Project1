package ObjectClass;

import java.util.Scanner;

public class ScannerCalss {

	public static void main(String[] args) {
	 int age =10;
	 double salary=3400.87;
	 String name= "jalna";
	 //object creation of Scanner Class
	 Scanner scanRef = new Scanner(System.in);
	age=scanRef.nextInt();
	System.out.println("age:"+age); 
	 
	salary=scanRef.nextInt();
	System.out.println("salary:"+salary);
	
	name=scanRef.next();
	System.out.println(name);

	}

}
