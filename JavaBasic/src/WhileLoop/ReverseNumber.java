package WhileLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=54321,reverse=0;
     while(num!=0)
     {
    	 int remainder= num%10;
    	 reverse= reverse*10 + remainder;
    	 num=num/10;
    	 
     }
     System.out.println("the reverse number"+reverse);
	}

}
