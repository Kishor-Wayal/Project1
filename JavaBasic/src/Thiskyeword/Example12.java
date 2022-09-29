package Thiskyeword;

public class Example12 {
	int rollno;
	float fee;
	Example12 (int rollno,float fee) {
		rollno = 24;
		fee = 330;
	}
	void display() {
		System.out.println(rollno+""+fee);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Example12 e1 = new Example12(22,345f);
      Example12 e2 = new Example12(122,3456f);
      e1.display();
      e2.display();
      
	}

}
