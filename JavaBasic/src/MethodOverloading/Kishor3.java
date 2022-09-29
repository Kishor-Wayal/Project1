package MethodOverloading;

public class Kishor3 {
	public double myMethod(int num1,int num2)
	{
		System.out.println("First myMethod of class Demo");
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Kishor3 ref1 =new Kishor3();
    ref1.myMethod(10,10);
	}

}
