package HomeWork;

public class Home0 {
	static void display() {
    	System.out.println("I am display");
	}
	static void print(char c1) {
		System.out.println("I am print method char:"+c1);
	}
	static void call(int num) {
		System.out.println("I am method calling:"+num);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Program Start");
   /* display();
    print('A');
    call(123);*/
    System.out.println("passing parameter using variable");
    display();
    int x=123;
    char c='A';
    print(c);
    call(x);
    
    }
	}


