package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection2 {
          public static void main(String args[]) {
				ArrayList list = new ArrayList();// Creating arraylist
				list.add("Mango");// auto-upcasting from String to Object class object
				list.add("Apple");
				list.add("Banana");
				list.add("123");
				// Printing the arraylist object
				System.out.println("size of list: " + list.size());
				System.out.println("Elements of list: " + list);
				System.out.println("Traversing list through for loop:");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.println("Traversing list through for-each loop:");
				// Traversing list through for-each loop
				for (Object fruit : list) {
					System.out.println(fruit);
				}
				// accessing the element
				System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																		// from 0
				// changing the element
				list.set(1, "Dates");
				System.out.println("size of list: " + list.size());
				System.out.println("Elements of list: " + list);
				// Sorting the list
				Collections.sort(list);//by default it sort the passed collection element in assending order and store it in the same collection
				System.out.println("size of list: " + list.size());
				System.out.println("Elements of list: " + list);

				System.out.println("Traversing list through forEach() method:");
				// The forEach() method is a new feature, introduced in Java 8.
				list.forEach(a -> { // Here, we are using lambda expression
					System.out.println(a);
				});
          }
}

