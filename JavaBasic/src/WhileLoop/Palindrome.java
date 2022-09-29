package WhileLoop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void Ex1() {
		int r,num1,sum=0,n=434;
		num1=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
	if(num1==sum) {
		System.out.println("Number is palindrome  = "+num1);
	}
	else {
		System.out.println("Number is Not palindrome = "+num1);
	}
		
	}

}
