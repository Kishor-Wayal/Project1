package day1basicprogram;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1=25,num2=25,result=num1/num2;
    System.out.println("number 1 is :"+num1);
    System.out.println("number 2 is :"+num2);
    System.out.println("division of two number:"+result);
    
    multi(5,5);
    division(10,5);
    Example5 ref1 = new Example5();
    ref1.sub();
	}
	
    public  int sub() {
    	int d= 10;
    	int e=5;
    	int res=d-e;
    	System.out.println("sub of number="+res);
    	return res;
    }
    public static void multi(int k,int j) {
    	int res= k*j;
    	System.out.println("multi of number="+res);
    }
    public static void division(int g,int f) {
    	int res = g/f;
    	System.out.println("divdision of number="+res);
    }
    
}
