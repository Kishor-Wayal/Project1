package day5logicalprogram;

public class Logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a= 0,b;
     b= a++ + ++a + a;
     System.out.println("res :"+a);
     System.out.println("res :"+b);
     System.out.println("*************");
     b= a-- + a-- + --a + a;
     System.out.println("res :"+a);
     System.out.println("res :"+b);
     System.out.println("***********");
     
     a=0;
     b=--a + --a + --a + a + ++a + a++;
     System.out.println("res :"+a);
     System.out.println("res :"+b);
     System.out.println("***************");
     a=0;
     b= a-- + a + ++a + a++ + ++a + a++ + a;
     
     System.out.println("res :"+a);
     System.out.println("res :"+b);
     
     
     
     
	}

}
