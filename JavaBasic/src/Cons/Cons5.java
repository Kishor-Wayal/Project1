package Cons;

public class Cons5 {
       int age;
       double salary;
       Cons5() {
    	   System.out.println("****Start Program");
    	   age = 25;
    	   salary = 3250.56;
    	   System.out.println("End Program");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cons5 c1 = new Cons5();
        System.out.println(c1.age);
        Cons5 c2 = new Cons5();
        System.out.println(c2.salary);
	}

}
