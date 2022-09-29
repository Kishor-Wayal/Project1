package day13pack2;

import day13pack1.ProtectedMembers;

 class AccessProtectedMembers1 extends ProtectedMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AccessProtectedMembers1 p1=new  AccessProtectedMembers1 ();
		System.out.println(p1.accNum);
		p1.dispalyaccNum();
	}

}
//not access from another child