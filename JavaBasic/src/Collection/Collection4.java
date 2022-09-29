package Collection;

import java.util.ArrayList;

public class Collection4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Kishor");
		al.add("Rahul");
		System.out.println("Elements of array:"+al);
		System.out.println(al.size());
		System.out.println(al.remove("Ravi"));
		System.out.println(al);
		System.out.println(al.remove(0));
		System.out.println(al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.addAll(al2);
		System.out.println(al);
		al.removeAll(al2);
		System.out.println(al);
		//al.removeIf(str -> str.contains("Rahul"));
		//System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
