package day4NonStaticGlobaleVariable;

public class NonStaticExample1 {
	int age=20;
	boolean res;
	char grade='A';
	float roi=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Program Start");
		NonStaticExample1 ref1 = new NonStaticExample1();
		System.out.println("default,Nonststic variable age:"+ref1.age);
		System.out.println("default,Nonststic variable age:"+ref1.res);
		System.out.println("default,Nonststic variable age:"+ref1.grade);
		System.out.println("default,Nonststic variable age:"+ref1.roi);
		System.out.println("Program Ends");
		

	}

}
