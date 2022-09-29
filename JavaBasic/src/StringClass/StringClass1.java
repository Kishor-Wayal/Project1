package StringClass;

public class StringClass1 {

	public static void main(String[] args) {
		StringClass1 c1 = new StringClass1();
		System.out.println("c1:"+c1);
		String s1 = "Mumbai";
		String s2 = "Mumbai";
		String s3 = "jalna";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s1 char count:"+s1.length());
        System.out.println("s2 char count:"+s2.length());
        System.out.println("s3 char count:"+s3.length());
        System.out.println("******************");
        System.out.println("s1 & s3 using '==':" +(s1==s3));
        System.out.println(s1==s2);
        
        System.out.println("s1 & s2 using equals(): "+s1.equals(s2));//compare s1 and s2 values
		System.out.println("s1 & s2 using '==': "+(s1==s2));//compare s1 & s2 based on address
		
		String s6=new String("Hyderabad");//two objects--> 1. in constant pool 2. in non-constant pool
		System.out.println("s6: "+s6);
		System.out.println("s1 & s6 using equals(): "+s1.equals(s6));//compare s1 and s6 values --> 
		System.out.println("s1 & s6 using '==': "+(s1==s6));//compare s1 & s6 based on address --
	}
	
	

}
