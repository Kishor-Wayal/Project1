package day2variableprogramExample1;

public class SataticGlobalVariable {
 
	static int num1, num2=25, res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Start");
		System.out.println("Number1 is :"+num1);
		System.out.println("Number2 is :"+num2);
		res=num1+num2;
		System.out.println("Result is :"+res);
		System.out.println("********************");
		num1=75;
		System.out.println("Number is :"+num1);
		System.out.println("Number2 is :"+num2);
		res=num1+num2;
		System.out.println("Result is :"+res);
		num2= 50;
		System.out.println("Number is :"+num1);
        System.out.println("Number is :"+num2);
        res=num1-num2;
        System.out.println("Result is :"+res);
	}

}
