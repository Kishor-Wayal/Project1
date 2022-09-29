package HomeWork;

//this keyword
	class Home10 {
		//Global Variable or non static GV or Instance GV
		int variable = 5;
		public static void main(String args[]) {
			Home10 obj = new Home10();
			obj.method(30);
			obj.method();
		}
		void method(int variable) {
			variable = 10;
			System.out.println("Value of Instance variable :" + this.variable);//5
			System.out.println("Value of Local variable :" + variable);//10
		}
		void method() {
			int variable = 40;
			System.out.println("Value of Instance variable :" + this.variable);//5
			System.out.println("Value of Local variable :" + variable);//40
		}
	}

