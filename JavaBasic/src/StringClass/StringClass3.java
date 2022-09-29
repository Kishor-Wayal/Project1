package StringClass;

public class StringClass3 {
	

	public static void main(String[] args) {
	   String s1= "I am Kishor Wayal, form Jalna in,maharstra";
	   System.out.println("Actual string:"+s1);
	   String[] strAry = s1.split(",");
	   for(String s:strAry) {
		   System.out.println(s);
	   }
	   System.out.println("*******************");
	   String s2= "I am from jalna";
	   System.out.println(s2);
	   String[]strary2 = s2.split("",3);
	   for(String s:strAry) {
		     System.out.println(s);
	   }
	   String s4="    im am kishor        ";
	   System.out.println("Actual String with spaces:"+s4);
	   System.out.println("Actual String with length:"+s4.length());
	   System.out.println(s4.trim());
	   System.out.println(s4.trim().length());
	}
	
}
