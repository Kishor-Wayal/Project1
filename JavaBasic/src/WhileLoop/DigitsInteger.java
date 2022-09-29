package WhileLoop;

public class DigitsInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count= 0, num=98763;
     while  (num !=0) {
    	 num/=10;
    	 ++count;
    	
     }
     System.out.println("Number of digit"+count);
     
	}

}
