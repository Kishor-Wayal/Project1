package ForLoop;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num = 123456, reverse =0;
      for(;num!=0;num=num/10) 
      {
     int remainder = num % 10;
     reverse=reverse*10+remainder;
    	  
  
      }
      System.out.println("the reverse of given number:"+reverse);
	}

}
