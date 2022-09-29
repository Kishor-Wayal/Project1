package ForLoop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seen();
		}
	       public static void Seen() {
	    	   int num=131, t,s,rem;
	    	   t=num;
	    	   for(s=0; num>0; num/=10) {
	    		   rem=num%10;
	    		   s=(s*10)+rem;
	    	   }
	    	   if(s==t) {
	    		   System.out.println("Number is palindrome "+s);
	    	   }
	    	   else {
	    		   System.out.println("Number is not  palindrome ");
	    	   }
	       }
	       
	
	}


