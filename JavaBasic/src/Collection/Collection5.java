package Collection;


import java.util.ArrayList;
import java.util.Collections;

public class Collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(23);
        al.add(45);
        al.add(34);
        System.out.println(al.size());
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        Collection5 al2 = new Collection5();
        al2.display();
        ArrayList<Collection5> al3 = new ArrayList<Collection5>();
	}
	

	 void display() {
		System.out.println("Hi i am  display meythod");
		
	}

}
