package Conditions;

public class IfConditions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=45, num2=30;
		
		if(num1!=num2) {
			System.out.println("Number1 is greater than numbers2");
		}else {
			System.out.println("Number1 is smaller than numbers2");
			if(num1<=num2 ) {
	System.out.println("Number1 is either equals to number2 or greater than numbers2");
	}else {
	System.out.println("Number1 is smaller than numbers2");
	}
		}
	}

}
