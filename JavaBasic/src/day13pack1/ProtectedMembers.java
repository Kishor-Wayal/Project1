package day13pack1;

public class ProtectedMembers {
	protected int accNum=1234;
       protected void dispalyaccNum() {
			System.out.println("Account number:"+accNum);
		}
		public static void main(String[] args) {
			ProtectedMembers p1=new ProtectedMembers ();
			System.out.println(p1.accNum);
			p1.dispalyaccNum();

	}

}
class AccessProtectedMembers{
	public static void main(String[]args) {
		ProtectedMembers p1=new ProtectedMembers ();
		System.out.println(p1.accNum);
		p1.dispalyaccNum();

	}
}