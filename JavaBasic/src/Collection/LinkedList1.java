package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> al = new LinkedList<String>();
       al.add("Ravi");
       al.add("Kishor");
       al.add("Kiran");
       System.out.println("Elements display:"+al);
       ListIterator itr1=al.listIterator();
       System.out.println(itr1.hasPrevious());
       System.out.println(itr1.hasNext());
       
       System.out.println(itr1.next());
       System.out.println(itr1.hasPrevious());
       System.out.println(itr1.hasNext());
     
       
       ListIterator itr=al.listIterator();
       
       System.out.println(itr.next());
       System.out.println(itr.hasPrevious());
       System.out.println(itr.previous());
       System.out.println(itr.hasPrevious());
	}
	

}
