package day5logicalprogram;

public class Logical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -95, b;
		b = a++;//
		int x = a, y;
		System.out.println(x);// -95
		y = ++x;// -94
		System.out.println(a);// -94
		System.out.println(b);// -95
		System.out.println(x);// -93
		System.out.println(y);// -93

		int p = 20, q = 45, res;

		res = p++ + --q;// res = 64
		System.out.println("res: " + res);// 
		System.out.println("p: " + p);// 20
		System.out.println("q: " + q);//44
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 = 
		System.out.println(res1);// 
		System.out.println("p: " + p);//
		System.out.println("q: " + q);// 
		System.out.println();
	}

	}


