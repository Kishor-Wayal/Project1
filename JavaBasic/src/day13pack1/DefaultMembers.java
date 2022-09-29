package day13pack1;

public class DefaultMembers {
	int accNum=1234;
	void dispalyaccNum() {
		System.out.println("Account number:"+accNum);
	}
	public static void main(String[] args) {
		DefaultMembers p1= new DefaultMembers();
		System.out.println(p1.accNum);
		p1.dispalyaccNum();
	}
	}


