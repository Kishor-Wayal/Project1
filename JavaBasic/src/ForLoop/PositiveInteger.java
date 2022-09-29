package ForLoop;

public class PositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Postive num
    int num = 10;
    System.out.println("factors of"+num+"are:");
    // loop runs from 1 to 20
    for (int i=1; i<=num; ++i) {
    	if(num%i==0) {
    		System.out.println(i);
    	}
    }
	}

}
