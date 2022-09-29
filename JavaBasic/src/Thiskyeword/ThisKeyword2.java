package Thiskyeword;

public class ThisKeyword2 {


		int variable = 5;

		public static void main(String args[]) {
			ThisKeyword2 obj = new ThisKeyword2();
			obj.method(20);
			obj.method();	
			System.out.println(obj.variable);//20 5
		}
		void method(int variable) {
			System.out.println("Value of variable :" + variable);//20
			variable = 10;
			System.out.println("Value of variable :" + variable);//10
		}
		void method() {
			int variable = 40;
			System.out.println("Value of variable :" + variable);//40
		}
	}

