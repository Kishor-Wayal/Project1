package Inheritances;
class fruit {
	fruit(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("fruit are sweet");
	}
}
class apple extends fruit {
	apple() {
		System.out.println("Apple is cons");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}

public class Inheritances2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
apple fr = new apple ();
fr.taste();
fr.shape();
	}

}
