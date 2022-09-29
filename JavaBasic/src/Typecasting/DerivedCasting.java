package Typecasting;
class grandparent{
	void myHome(){
		System.out.println("Home belong to Grandparent");
	}
}
class parent extends grandparent{
	void show() {
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class child extends parent{
	void redmi() {
		System.out.println("child reame method is called");
	}
}

public class DerivedCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       child c1=new child();
       c1.redmi();
       c1.callme();
       c1.show();
       c1.myHome();
       System.out.println("**************");
       parent p1=new parent();
       p1.callme();
       p1.myHome();
       p1.show();
       
	}

}
