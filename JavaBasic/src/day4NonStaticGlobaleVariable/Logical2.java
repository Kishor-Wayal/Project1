package day4NonStaticGlobaleVariable;

public class Logical2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=10,b;
 b= a++ + ++a + ++a +a;
 // 10+12+13+13
 System.out.println("Printvalue"+a);
 System.out.println("Printvalue"+b);
 
 a=5;
 b=a-- + --a + --a + a;
 // 5+3+2+2
 System.out.println("Printvalue"+a);
 System.out.println("Printvalue"+b);
 
 a=0;
 b= --a + --a + --a + a + ++a + a++;
 //b= -1+-2+-3+-3+-2+-2
 System.out.println("Printvalue"+a);
 System.out.println("Printvalue"+b);
 
 a=2;
 b= a-- + a + ++a + a++ + ++a + a++ + a;
 //2+1+2+2+4+4+5
 System.out.println("Printvalue"+a);
 System.out.println("Printvalue"+b);
 
	}

}
