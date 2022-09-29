package WhileLoop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=5,i=2;
    boolean flag = false;
    while (i<=num/2) {
    	if (num%i==0) {
    		flag = true;
    	}
    	++i;
    	
    }
    if (!flag)
    	System.out.println("prime number"+num);
    else
    	System.out.println("not prime number"+num);
	}

}
