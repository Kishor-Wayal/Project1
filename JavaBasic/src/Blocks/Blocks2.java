package Blocks;

public class Blocks2 {
Blocks2(){
	System.out.println("zero parameter cons");
}
 static {
	 System.out.println("static block1");
 }
 {
	 System.out.println("non-static block1 ");
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Blocks2 b1 = new Blocks2();
System.out.println(b1);
	}

}
