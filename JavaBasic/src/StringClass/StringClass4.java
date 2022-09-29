package StringClass;

public class StringClass4 {

	
		public static void main(String[] args) {
			StringClass4 s1=new StringClass4();
			System.out.println("s1: "+s1);
			System.out.println("s1:"+s1.hashCode());
			
			String s2=new String("Pune is IT hub");
			System.out.println("s2: "+s2.toString());
			System.out.println("s2 content count: "+s2.length());
		}

	}